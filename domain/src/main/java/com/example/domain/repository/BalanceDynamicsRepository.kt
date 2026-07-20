package com.example.domain.repository

import com.example.domain.model.balanceDynamics.BalanceSnapshot
import com.example.domain.model.enums.BalancePeriod
import kotlinx.coroutines.flow.Flow

interface BalanceDynamicsRepository {
    fun fetchBalanceDynamics(period: BalancePeriod): Flow<BalanceSnapshot>
}