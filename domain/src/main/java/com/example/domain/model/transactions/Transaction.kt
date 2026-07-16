package com.example.domain.model.transactions

import com.example.domain.model.Currency
import java.math.BigDecimal
import java.time.LocalDateTime

data class Transaction(
    val transactionID: String,
    val amount: BigDecimal,
    val currency: Currency,
    val category: String,
    val merchant: String,
    val timestamp: LocalDateTime
)