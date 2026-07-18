package com.example.domain.model.transactions

import com.example.domain.model.enums.Currency
import com.example.domain.model.enums.Category
import java.math.BigDecimal
import java.time.LocalDateTime

data class Transaction(
    val amount: BigDecimal,
    val category: Category,
    val currency: Currency,
    val merchant: String,
    val timestamp: LocalDateTime,
    val transactionID: String
)

// Double or Float use binary approximations,
// causing tiny rounding errors — risky for financial data.
// BigDecimal avoids binary approximations —
// it stores numbers as exact decimal digits.