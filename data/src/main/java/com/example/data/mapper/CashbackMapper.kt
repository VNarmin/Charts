package com.example.data.mapper

import com.example.data.dto.cashback.CategoryCashbackDTO
import com.example.data.dto.cashback.MonthlyCashbackResponseDTO
import com.example.domain.model.cashback.CategoryCashback
import com.example.domain.model.cashback.MonthlyCashbackSummary
import com.example.domain.model.enums.toCategory
import com.example.domain.model.enums.toCurrency
import java.math.BigDecimal

internal fun MonthlyCashbackResponseDTO.toDomain(): MonthlyCashbackSummary {
    return MonthlyCashbackSummary(
        currency = this.currency.toCurrency(),
        categories = this.categories.toDomain()
    )
}

private fun CategoryCashbackDTO.toDomain(): CategoryCashback {
    return CategoryCashback(
        cashback = this.cashback?.toBigDecimal()?.abs() ?: BigDecimal.ZERO,
        category = this.category.toCategory()
    )
}

private fun List<CategoryCashbackDTO?>?.toDomain(): List<CategoryCashback> {
    return this.orEmpty().mapNotNull { category -> category?.toDomain() }
}