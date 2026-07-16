package com.example.domain.model.balanceDynamics

import com.example.domain.model.Currency
import java.math.BigDecimal

data class BalanceData(
    val balanceHistory: List<BalanceHistory>,
    val balanceChange: BalanceChange,
    val currency: Currency
) {
    val lastBalance: BigDecimal
        get() = balanceHistory.last().amount
}
