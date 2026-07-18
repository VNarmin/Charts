package com.example.domain.model.cashback

import com.example.domain.model.common.Category
import java.math.BigDecimal

data class CategoryCashback(
    val cashback: BigDecimal,
    val category: Category
)