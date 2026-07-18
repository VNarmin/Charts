package com.example.data.mapper

import com.example.data.dto.cashFlow.CashFlowTrendDTO
import com.example.data.dto.cashFlow.MonthlyCashFlowDTO
import com.example.domain.model.cashFlow.CashFlowTrend
import com.example.domain.model.cashFlow.MonthlyCashFlow
import com.example.domain.model.enums.toCurrency
import java.math.BigDecimal
import java.time.YearMonth
import java.time.format.DateTimeFormatter
import java.util.Locale
import kotlin.collections.mapNotNull

internal fun CashFlowTrendDTO.toDomain(): CashFlowTrend {
    return CashFlowTrend(
        currency = this.currency.toCurrency(),
        cashFlow = this.cashFlow.toDomain()
    )
}

private fun List<MonthlyCashFlowDTO?>?.toDomain(): List<MonthlyCashFlow> {
    return this.orEmpty().mapNotNull { monthly -> monthly?.toDomain() }
}

private fun MonthlyCashFlowDTO.toDomain(): MonthlyCashFlow {
    return MonthlyCashFlow(
        period = this.toYearMonth(),
        income = this.income?.toBigDecimal()?.abs() ?: BigDecimal.ZERO,
        expense = this.expense?.toBigDecimal()?.abs() ?: BigDecimal.ZERO,
    )
}

private val formatter = DateTimeFormatter.ofPattern("MMM yyyy", Locale.ENGLISH)

private fun MonthlyCashFlowDTO.toYearMonth(): YearMonth {
    return YearMonth.parse(this.period, formatter)
}