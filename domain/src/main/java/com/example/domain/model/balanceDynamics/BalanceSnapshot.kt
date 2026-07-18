package com.example.domain.model.balanceDynamics

import com.example.domain.model.common.Currency
import java.math.BigDecimal

data class BalanceSnapshot(
    val balanceChange: BalanceChange,
    val balanceHistory: List<BalanceHistoryEntry>,
    val balancePeriod: BalancePeriod,
    val currency: Currency
) {
    val lastBalance: BigDecimal?
        get() = balanceHistory.lastOrNull()?.amount
}
