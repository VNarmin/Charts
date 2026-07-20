package com.example.data.dto.cashFlow

import com.google.firebase.firestore.PropertyName

data class CashFlowMetadata(
    @PropertyName(value = "currency")
    val currency: String = "",

    @PropertyName(value = "periodEnd")
    val periodEnd: String = "",

    @PropertyName(value = "periodStart")
    val periodStart: String = ""
)