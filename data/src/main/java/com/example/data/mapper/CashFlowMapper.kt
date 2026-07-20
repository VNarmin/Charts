package com.example.data.mapper

import com.example.data.dto.cashFlow.CashFlowMetadata
import com.example.data.dto.cashFlow.MonthlyCashFlowDTO
import com.example.domain.model.cashFlow.CashFlowTrend
import com.example.domain.model.cashFlow.MonthlyCashFlow
import com.example.domain.model.enums.toCurrency
import java.time.YearMonth
import java.time.format.DateTimeFormatter
import java.util.Locale

internal fun toDomain(
    metadata: CashFlowMetadata,
    cashFlow: List<MonthlyCashFlowDTO>
): CashFlowTrend {
    return CashFlowTrend(
        currency = metadata.currency.toCurrency(),
        cashFlow = cashFlow.toDomain()
    )
}

private fun List<MonthlyCashFlowDTO>.toDomain(): List<MonthlyCashFlow> {
    return this.map { monthly -> monthly.toDomain() }
}

private fun MonthlyCashFlowDTO.toDomain(): MonthlyCashFlow {
    return MonthlyCashFlow(
        period = this.toYearMonth(),
        income = this.income.toBigDecimal().abs(),
        expense = this.expense.toBigDecimal().abs(),
    )
}

private val formatter = DateTimeFormatter.ofPattern("MMM yyyy", Locale.ENGLISH)

private fun MonthlyCashFlowDTO.toYearMonth(): YearMonth {
    return YearMonth.parse(this.period, formatter)
}