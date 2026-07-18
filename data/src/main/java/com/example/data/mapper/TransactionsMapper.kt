package com.example.data.mapper

import com.example.data.dto.transactions.TransactionDTO
import com.example.data.dto.transactions.TransactionsResponseDTO
import com.example.domain.model.enums.toCategory
import com.example.domain.model.enums.toCurrency
import com.example.domain.model.transactions.Transaction
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

internal fun TransactionsResponseDTO.toDomain(): List<Transaction> {
    return this.transactions.orEmpty().mapNotNull { transaction ->
        transaction?.toDomain()
    }
}

private fun TransactionDTO.toDomain(): Transaction {
    return Transaction(
        amount = this.amount?.toBigDecimal()?.abs() ?: BigDecimal.ZERO,
        category = this.category.toCategory(),
        currency = this.currency.toCurrency(),
        merchant = this.merchant.orEmpty(),
        timestamp = this.toLocalDateTime(),
        transactionID = this.transactionID.orEmpty()
    )
}

private fun TransactionDTO.toLocalDateTime(): LocalDateTime {
    val localDate = LocalDate.parse(this.date)
    val localTime = LocalTime.parse(this.time)
    return LocalDateTime.of(localDate, localTime)
}