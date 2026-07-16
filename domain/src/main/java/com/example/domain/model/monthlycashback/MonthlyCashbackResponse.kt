package com.example.domain.model.monthlycashback

import com.example.domain.model.Currency
import java.math.BigDecimal

data class MonthlyCashbackResponse(
    val categoricalData: List<CategoricalCashback>,
    val currency: Currency
) {
    val totalCashback: BigDecimal
        get() = categoricalData.sumOf { category -> category.cashback }
}
