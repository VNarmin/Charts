package com.example.data.repository

import com.example.data.dto.cashback.CashbackMetadata
import com.example.data.dto.cashback.CategoryCashbackDTO
import com.example.data.mapper.toMonthlyCashbackSummary
import com.example.domain.model.cashback.MonthlyCashbackSummary
import com.example.domain.repository.CashbackRepository
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.tasks.await

class CashbackRepositoryImpl(
    private val firestore: FirebaseFirestore,
    private val dispatcher: CoroutineDispatcher
) : CashbackRepository {

    override fun fetchCashback(): Flow<MonthlyCashbackSummary> = flow {
        val collection = firestore.collection("cashback")

        val metaSnapshot = collection
            .document("_metadata").get().await()
        val metadata = metaSnapshot
            .toObject(CashbackMetadata::class.java)
            ?: CashbackMetadata()

        val snapshot = collection.get().await()
        val categories = snapshot.documents
            .filter { document -> document.id != "_metadata" }
            .mapNotNull { document ->
                document.toObject(CategoryCashbackDTO::class.java)
            }

        val result = toMonthlyCashbackSummary(
            metadata = metadata,
            categories = categories
        )
        emit(value = result)
    }.flowOn(context = dispatcher)
}