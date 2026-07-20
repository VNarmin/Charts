package com.example.domain.model.transactions

import com.example.domain.model.enums.Category
import java.math.BigDecimal

data class CategorySummary(
    val category: Category,
    val share: BigDecimal,
    val totalAmount: BigDecimal,
    val transactionCount: Int
)