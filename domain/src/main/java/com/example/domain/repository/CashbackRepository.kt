package com.example.domain.repository

import com.example.domain.model.cashback.MonthlyCashbackSummary
import kotlinx.coroutines.flow.Flow

interface CashbackRepository {
    fun fetchCashback(): Flow<MonthlyCashbackSummary>
}