package com.example.domain.model.cashFlow

import java.math.BigDecimal
import java.time.YearMonth

data class MonthlyCashFlow(
    val period: YearMonth,
    val income: BigDecimal,
    val expense: BigDecimal
)