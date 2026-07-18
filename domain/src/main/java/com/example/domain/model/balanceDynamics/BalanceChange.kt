package com.example.domain.model.balanceDynamics

import java.math.BigDecimal

data class BalanceChange(
    val direction: BalanceChangeDirection,
    val percentage: BigDecimal
)