package com.example.data.repository

import com.example.domain.model.balanceDynamics.BalanceSnapshot
import com.example.domain.model.enums.BalancePeriod
import com.example.domain.repository.BalanceDynamicsRepository
import kotlinx.coroutines.flow.Flow

class BalanceDynamicsRepositoryImpl : BalanceDynamicsRepository {
    override fun fetchBalanceDynamics(period: BalancePeriod): Flow<BalanceSnapshot> {
        TODO("Not yet implemented")
    }
}