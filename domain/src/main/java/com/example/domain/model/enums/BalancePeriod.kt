package com.example.domain.model.enums

enum class BalancePeriod(val value: String) {
    LAST_24_HOURS(value = "24h"),
    LAST_7_DAYS(value = "7d"),
    LAST_30_DAYS(value = "30d"),
    LAST_12_MONTHS(value = "12m")
}