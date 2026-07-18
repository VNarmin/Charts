package com.example.domain.model.balanceDynamics

import com.example.domain.model.enums.BalanceChangeDirection
import com.example.domain.model.enums.BalancePeriod
import com.example.domain.model.enums.Currency
import java.math.BigDecimal

data class BalanceSnapshot(
    val direction: BalanceChangeDirection,
    val percentage: BigDecimal,
    val balanceHistory: List<BalanceHistoryEntry>,
    val balancePeriod: BalancePeriod,
    val currency: Currency
) {
    val lastBalance: BigDecimal?
        get() = balanceHistory.lastOrNull()?.amount
}