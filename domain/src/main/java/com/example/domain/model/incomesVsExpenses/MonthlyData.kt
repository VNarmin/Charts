package com.example.domain.model.incomesVsExpenses

import java.math.BigDecimal

data class MonthlyData(
    val month: String,
    val income: BigDecimal,
    val expense: BigDecimal
)
