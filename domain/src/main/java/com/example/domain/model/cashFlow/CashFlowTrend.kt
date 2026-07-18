package com.example.domain.model.cashFlow

import com.example.domain.model.enums.Currency
import java.math.BigDecimal

data class CashFlowTrend(
    val currency: Currency,
    val cashFlow: List<MonthlyCashFlow>
) {
    val totalIncome: BigDecimal
        get() = cashFlow.sumOf { monthly -> monthly.income }

    val totalExpense: BigDecimal
        get() = cashFlow.sumOf { monthly -> monthly.expense }

    val netChange: BigDecimal
        get() = totalIncome - totalExpense
}