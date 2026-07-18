package com.example.domain.model.transactions

import java.math.BigDecimal

data class CategorySummary(
    val categoryDisplayName: String,
    val share: BigDecimal,
    val totalAmount: BigDecimal,
    val transactionCount: Int
)