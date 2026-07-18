package com.example.domain.model.cashback

import com.example.domain.model.common.Currency
import java.math.BigDecimal

data class MonthlyCashbackSummary(
    val currency: Currency,
    val categories: List<CategoryCashback>
) {
    val totalCashback: BigDecimal
        get() = categories.sumOf { category -> category.cashback }
}