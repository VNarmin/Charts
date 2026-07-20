package com.example.domain.repository

import com.example.domain.model.cashFlow.CashFlowTrend
import kotlinx.coroutines.flow.Flow

interface CashFlowRepository {
    fun fetchCashFlow(): Flow<CashFlowTrend>
}