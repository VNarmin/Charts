package com.example.domain.repository

import com.example.domain.model.enums.Category
import com.example.domain.model.transactions.Transaction
import kotlinx.coroutines.flow.Flow

interface TransactionsRepository {
    fun fetchTransactions(): Flow<List<Transaction>>

    fun fetchTransactionsByCategory(category: Category): Flow<List<Transaction>>
}