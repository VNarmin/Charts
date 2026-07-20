package com.example.data.repository

import com.example.domain.model.cashFlow.CashFlowTrend
import com.example.domain.repository.CashFlowRepository
import kotlinx.coroutines.flow.Flow

class CashFlowRepositoryImpl : CashFlowRepository {
    override fun fetchCashFlow(): Flow<CashFlowTrend> {
        TODO("Not yet implemented")
    }
}