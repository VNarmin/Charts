package com.example.data.dto.cashback

import com.google.firebase.firestore.PropertyName

data class CashbackMetadata(
    @PropertyName(value = "currency")
    val currency: String = "",

    @PropertyName(value = "periodEnd")
    val periodEnd: String = "",

    @PropertyName(value = "periodStart")
    val periodStart: String = ""
)