package com.example.domain.model.common

import java.math.BigDecimal

enum class Currency {
    AZN,
    EUR,
    USD
}

val exchangeRatesToAZN: Map<Currency, BigDecimal> = mapOf(
    Currency.AZN to BigDecimal("1.00"),
    Currency.EUR to BigDecimal("1.95"),
    Currency.USD to BigDecimal("1.70")
)

fun toAZN(amount: BigDecimal, currency: Currency) : BigDecimal {
    val exchangeRate = exchangeRatesToAZN.getValue(key = currency)
    val amountAZN = amount * exchangeRate
    return amountAZN
}