package com.example.data.dto.balanceHistory

import com.google.gson.annotations.SerializedName

data class BalanceHistoryResponse(
    @SerializedName(value = "data")
    val data: Data?,

    @SerializedName(value = "message")
    val message: String?
)