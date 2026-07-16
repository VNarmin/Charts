package com.example.domain.model.incomesVsExpenses

import com.example.domain.model.Currency
import java.math.BigDecimal

data class IncomesVsExpensesResponses(
    val monthlyData: List<MonthlyData>,
    val currency: Currency
) {
    val incomes: List<BigDecimal>
        get() = monthlyData.map { monthlyData -> monthlyData.income }

    val expenses: List<BigDecimal>
        get() = monthlyData.map { monthlyData -> monthlyData.expense }
}
