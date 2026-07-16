package com.example.domain.model.transactions

import java.math.BigDecimal

data class Category(
    val categoryDisplayName: String,
    val transactionCount: Int,
    val totalAmount: BigDecimal,
    val percentage: BigDecimal
)