package com.example.domain.model.enums

enum class BalanceChangeDirection {
    UP,
    DOWN,
    FLAT,
    UNKNOWN
}

fun String.toBalanceChangeDirection(): BalanceChangeDirection {
    return BalanceChangeDirection.entries.find { direction ->
        direction.name.equals(this, ignoreCase = true)
    } ?: BalanceChangeDirection.UNKNOWN
}