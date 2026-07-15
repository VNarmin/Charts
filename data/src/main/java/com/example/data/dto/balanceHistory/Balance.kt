package com.example.data.dto.balanceHistory

import com.google.gson.annotations.SerializedName

data class Balance(
    @SerializedName(value = "amountText")
    val amountText: String?,

    @SerializedName(value = "change")
    val change: Change?,

    @SerializedName(value = "currency")
    val currency: String?,

    @SerializedName(value = "history")
    val history: List<History?>?
)