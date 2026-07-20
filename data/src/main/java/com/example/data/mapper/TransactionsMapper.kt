package com.example.data.mapper

import com.example.data.dto.transactions.TransactionDTO
import com.example.domain.model.enums.toCategory
import com.example.domain.model.enums.toCurrency
import com.example.domain.model.transactions.Transaction
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

internal fun List<TransactionDTO>.toDomain(): List<Transaction> {
    return this.map { transaction -> transaction.toDomain() }
}

private fun TransactionDTO.toDomain(): Transaction {
    return Transaction(
        amount = this.amount.toBigDecimal().abs(),
        category = this.category.toCategory(),
        currency = this.currency.toCurrency(),
        merchant = this.merchant,
        timestamp = this.toLocalDateTime(),
        transactionID = this.transactionID
    )
}

private fun TransactionDTO.toLocalDateTime(): LocalDateTime {
    val localDate = LocalDate.parse(this.date)
    val localTime = LocalTime.parse(this.time)
    return LocalDateTime.of(localDate, localTime)
}