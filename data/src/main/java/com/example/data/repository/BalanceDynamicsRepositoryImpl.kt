package com.example.data.repository

import com.example.data.dto.balanceDynamics.BalanceDynamicsResponseDTO
import com.example.data.mapper.toDomain
import com.example.domain.model.balanceDynamics.BalanceSnapshot
import com.example.domain.model.enums.BalancePeriod
import com.example.domain.repository.BalanceDynamicsRepository
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.tasks.await

class BalanceDynamicsRepositoryImpl(
    private val firestore: FirebaseFirestore,
    private val dispatcher: CoroutineDispatcher
) : BalanceDynamicsRepository {

    override fun fetchBalanceDynamics(period: BalancePeriod)
    : Flow<BalanceSnapshot> = flow {
        val collection = firestore.collection("balanceDynamics")

        val snapshot = collection
            .document(period.value)
            .get()
            .await()
        val balanceDynamics = snapshot
            .toObject(BalanceDynamicsResponseDTO::class.java)
            ?: throw NoSuchElementException(
                "No balance dynamics data found for the specified period."
            )

        val result = balanceDynamics.data.balanceSnapshot.toDomain(period = period)
        emit(value = result)
    }.flowOn(context = dispatcher)
}