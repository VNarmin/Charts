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
    UNKNOWN;

    val firestoreValue: String
        get() = when (this) {
            BOOKS -> "Books"
            CINEMA -> "Cinema"
            CLOTHING -> "Clothing"
            DIGITAL -> "Digital"
            ELECTRONICS -> "Electronics"
            GROCERIES -> "Groceries"
            HEALTH -> "Health"
            ONLINE_COURSES -> "Online Courses"
            RESTAURANTS -> "Restaurants"
            TELECOMMUNICATION -> "Telecommunication"
            TRANSFER -> "Transfer"
            TRANSPORT -> "Transport"
            UNKNOWN -> "Unknown"
        }
}

fun String.toCategory(): Category {
    val normalized = this.trim().replace(oldValue = " ", newValue = "_")
    return Category.entries.find { category ->
        category.name.equals(other = normalized, ignoreCase = true)
    } ?: Category.UNKNOWN
}