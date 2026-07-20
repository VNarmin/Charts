package com.example.data.repository

import com.example.data.dto.cashFlow.CashFlowMetadata
import com.example.data.dto.cashFlow.MonthlyCashFlowDTO
import com.example.data.mapper.toCashFlowTrend
import com.example.domain.model.cashFlow.CashFlowTrend
import com.example.domain.repository.CashFlowRepository
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.tasks.await

class CashFlowRepositoryImpl(
    private val firestore: FirebaseFirestore,
    private val dispatcher: CoroutineDispatcher
) : CashFlowRepository {

    override fun fetchCashFlow(): Flow<CashFlowTrend> = flow {
        val collection = firestore.collection("cashFlow")

        val metaSnapshot = collection
            .document("_metadata").get().await()
        val metadata = metaSnapshot
            .toObject(CashFlowMetadata::class.java)
            ?: CashFlowMetadata()

        val snapshot = collection.get().await()
        val cashFlow = snapshot.documents
            .filter { document -> document.id != "_metadata" }
            .mapNotNull { document ->
                document.toObject(MonthlyCashFlowDTO::class.java)
            }

        val result = toCashFlowTrend(metadata = metadata, cashFlow = cashFlow)
        emit(value = result)
    }.flowOn(context = dispatcher)
}