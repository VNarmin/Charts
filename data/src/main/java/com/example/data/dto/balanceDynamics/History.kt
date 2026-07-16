package com.example.data.dto.balanceDynamics

import com.google.gson.annotations.SerializedName

data class History(
    @SerializedName(value = "amount")
    val amount: Double?,

    @SerializedName(value = "timestamp")
    val timestamp: String?
)