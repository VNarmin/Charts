package com.example.data.dto.balanceDynamics

import com.google.firebase.firestore.PropertyName

data class BalanceHistoryEntryDTO(
    @PropertyName(value = "amount")
    val amount: Double = 0.0,

    @PropertyName(value = "timestamp")
    val timestamp: String = ""
)