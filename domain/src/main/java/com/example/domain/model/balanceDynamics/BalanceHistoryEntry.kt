package com.example.domain.model.balanceDynamics

import java.math.BigDecimal
import java.time.LocalDateTime

data class BalanceHistoryEntry(
    val amount: BigDecimal,
    val timestamp: LocalDateTime
)