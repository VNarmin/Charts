package com.example.domain.model.balanceDynamics

import java.math.BigDecimal
import java.time.LocalDateTime

data class BalanceHistory(
    val amount: BigDecimal,
    val timestamp: LocalDateTime
)