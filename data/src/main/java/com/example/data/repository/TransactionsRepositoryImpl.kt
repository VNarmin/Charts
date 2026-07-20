package com.example.data.repository

import com.example.data.dto.transactions.TransactionDTO
import com.example.data.mapper.toDomain
import com.example.domain.model.enums.Category
import com.example.domain.model.transactions.Transaction
import com.example.domain.repository.TransactionsRepository
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.tasks.await

class TransactionsRepositoryImpl(
    private val firestore: FirebaseFirestore,
    private val dispatcher: CoroutineDispatcher
) : TransactionsRepository {

    override fun fetchTransactions(): Flow<List<Transaction>> = flow {
        val collection = firestore.collection("transactions")

        val snapshot = collection.get().await()
        val transactions = snapshot.documents
            .filter { document -> document.id != "_metadata" }
            .mapNotNull { document ->
                document.toObject(TransactionDTO::class.java)
            }

        val result = transactions.toDomain()
        emit(value = result)
    }.flowOn(context = dispatcher)

    override fun fetchTransactionsByCategory(category: Category)
    : Flow<List<Transaction>> = flow {
        val collection = firestore.collection("transactions")

        val snapshot = collection
            .whereEqualTo("category", category.firestoreValue)
            .get()
            .await()
        val transactions = snapshot.documents
            .mapNotNull { document ->
                document.toObject(TransactionDTO::class.java)
            }

        val result = transactions.toDomain()
        emit(value = result)
    }.flowOn(context = dispatcher)
}