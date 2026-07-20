package com.example.data.mapper

import com.example.data.dto.cashback.CashbackMetadata
import com.example.data.dto.cashback.CategoryCashbackDTO
import com.example.domain.model.cashback.CategoryCashback
import com.example.domain.model.cashback.MonthlyCashbackSummary
import com.example.domain.model.enums.toCategory
import com.example.domain.model.enums.toCurrency

internal fun toMonthlyCashbackSummary(
    metadata: CashbackMetadata,
    categories: List<CategoryCashbackDTO>
): MonthlyCashbackSummary {
    return MonthlyCashbackSummary(
        currency = metadata.currency.toCurrency(),
        categories = categories.toDomain()
    )
}

private fun List<CategoryCashbackDTO>.toDomain(): List<CategoryCashback> {
    return this.map { category -> category.toDomain() }
}

private fun CategoryCashbackDTO.toDomain(): CategoryCashback {
    return CategoryCashback(
        cashback = this.cashback.toBigDecimal().abs(),
        category = this.category.toCategory()
    )
}