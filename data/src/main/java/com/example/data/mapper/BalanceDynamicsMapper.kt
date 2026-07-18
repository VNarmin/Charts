package com.example.data.mapper

import com.example.data.dto.balanceDynamics.BalanceHistoryEntryDTO
import com.example.data.dto.balanceDynamics.BalanceSnapshotDTO
import com.example.domain.model.balanceDynamics.BalanceHistoryEntry
import com.example.domain.model.enums.BalancePeriod
import com.example.domain.model.balanceDynamics.BalanceSnapshot
import com.example.domain.model.enums.toBalanceChangeDirection
import com.example.domain.model.enums.toCurrency
import java.math.BigDecimal
import java.time.LocalDateTime

internal fun BalanceSnapshotDTO.toDomain(period: BalancePeriod): BalanceSnapshot {
    return BalanceSnapshot(
        direction = this.change?.direction.toBalanceChangeDirection(),
        percentage = this.change?.percentage.toPercentage(),
        balanceHistory = this.history.toDomain(),
        balancePeriod = period,
        currency = this.currency.toCurrency()
    )
}

private fun String?.toPercentage(): BigDecimal {
    return this
        ?.removeSuffix("%")
        ?.toBigDecimalOrNull()
        ?.abs()
        ?: BigDecimal.ZERO
}

private fun BalanceHistoryEntryDTO.toDomain(): BalanceHistoryEntry {
    return BalanceHistoryEntry(
        amount = this.amount?.toBigDecimal()?.abs() ?: BigDecimal.ZERO,
        timestamp = this.toLocalDateTime()
    )
}

private fun List<BalanceHistoryEntryDTO?>?.toDomain(): List<BalanceHistoryEntry> {
    return this.orEmpty().mapNotNull { entry -> entry?.toDomain() }
}

private fun BalanceHistoryEntryDTO.toLocalDateTime(): LocalDateTime {
    return LocalDateTime.parse(this.timestamp)
}