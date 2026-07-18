package com.example.domain.usecase

import com.example.domain.model.enums.toAZN
import com.example.domain.model.transactions.Transaction
import com.example.domain.model.transactions.CategorySummary
import java.math.BigDecimal
import java.math.RoundingMode

// when a user views their monthly summary,
// group their transactions by category and
// calculate the share of each category
data class TransactionSummary(
    val totalExpenses: BigDecimal,
    val totalTransactions: Int,
    val categories: List<CategorySummary>
)

class SummarizeTransactionsUseCase {
    operator fun invoke(transactions: List<Transaction>): TransactionSummary {
        val totalExpenses = transactions.sumOf { transaction ->
            toAZN(amount = transaction.amount, currency = transaction.currency)
        }
        val categories = transactions
            .groupBy { transaction -> transaction.category }
            .map { (category, transactions) ->
                val totalAmount = transactions.sumOf { transaction ->
                    toAZN(amount = transaction.amount, currency = transaction.currency)
                }
                CategorySummary(
                    categoryDisplayName = category.name,
                    transactionCount = transactions.size,
                    totalAmount = totalAmount,
                    share = if (totalExpenses > BigDecimal.ZERO)
                        totalAmount.divide(
                            totalExpenses,
                            2,
                            RoundingMode.HALF_UP
                        )
                    else BigDecimal.ZERO
                )
            }
        return TransactionSummary(
            totalExpenses = totalExpenses,
            totalTransactions = transactions.size,
            categories = categories
        )
    }
}