package com.example.data.repository

import com.example.domain.model.cashback.MonthlyCashbackSummary
import com.example.domain.repository.CashbackRepository
import kotlinx.coroutines.flow.Flow

class CashbackRepositoryImpl : CashbackRepository {
    override fun fetchCashback(): Flow<MonthlyCashbackSummary> {
        TODO("Not yet implemented")
    }
}