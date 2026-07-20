package com.example.data.dto.transactions

import com.google.firebase.firestore.PropertyName

data class TransactionsMetadata(
    @PropertyName(value = "periodEnd")
    val periodEnd: String = "",

    @PropertyName(value = "periodStart")
    val periodStart: String = "",
)