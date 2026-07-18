package com.example.domain.model.enums

enum class Category {
    BOOKS,
    CINEMA,
    CLOTHING,
    DIGITAL,
    ELECTRONICS,
    GROCERIES,
    HEALTH,
    ONLINE_COURSES,
    RESTAURANTS,
    TELECOMMUNICATION,
    TRANSFER,
    TRANSPORT,
    UNKNOWN
}

fun String?.toCategory(): Category {
    return Category.entries.find { category ->
        category.name.equals(this, ignoreCase = true)
    } ?: Category.UNKNOWN
}