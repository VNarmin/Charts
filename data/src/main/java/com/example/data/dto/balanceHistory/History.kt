package com.example.data.dto.balanceHistory

import com.google.gson.annotations.SerializedName

data class History(
    @SerializedName(value = "amount")
    val amount: Double?,

    @SerializedName(value = "amountText")
    val amountText: String?,

    @SerializedName(value = "timestamp")
    val timestamp: String?
)