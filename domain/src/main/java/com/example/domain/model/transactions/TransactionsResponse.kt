package com.example.domain.model.transactions

import java.math.BigDecimal
import java.math.RoundingMode

data class TransactionsResponse(
    val transactions: List<Transaction>
) {
    val totalExpenses: BigDecimal
        get() = transactions.sumOf { transaction -> transaction.amount.abs() }

    val totalTransactions: Int
        get() = transactions.size

    val categories: List<Category>
        get() {
            return transactions
                .groupBy { transaction -> transaction.category }
                .map { (category, transactions) ->
                    val totalAmount = transactions.sumOf {
                        transaction -> transaction.amount.abs()
                    }
                    Category(
                        categoryDisplayName = category,
                        transactionCount = transactions.size,
                        totalAmount = totalAmount,
                        percentage = if (totalExpenses > BigDecimal.ZERO)
                            totalAmount.divide(
                                totalExpenses,
                                4,
                                RoundingMode.HALF_UP
                            ) else BigDecimal.ZERO
                    )
                }
        }
}