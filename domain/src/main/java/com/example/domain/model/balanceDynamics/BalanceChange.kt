package com.example.domain.model.balanceDynamics

import java.math.BigDecimal

data class BalanceChange(
    val direction: ChangeDirection,
    val percentage: BigDecimal
)