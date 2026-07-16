package com.example.domain.model.monthlycashback

import java.math.BigDecimal

data class CategoricalCashback(
    val category: String,
    val cashback: BigDecimal
)
