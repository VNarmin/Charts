package com.example.data.repository

import com.example.domain.model.enums.Category
import com.example.domain.model.transactions.Transaction
import com.example.domain.repository.TransactionsRepository
import kotlinx.coroutines.flow.Flow

class TransactionsRepositoryImpl : TransactionsRepository {
    override fun fetchTransactions(): Flow<List<Transaction>> {
        TODO("Not yet implemented")
    }

    override fun fetchTransactionsByCategory(category: Category): Flow<List<Transaction>> {
        TODO("Not yet implemented")
    }
}

// redesign DTOs and mappers
// populate repository implementations
// compose all the charts