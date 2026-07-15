package com.example.data.dto.transactions

import com.google.gson.annotations.SerializedName

data class TransactionsResponse(
    @SerializedName(value = "data")
    val data: Data?,

    @SerializedName(value = "message")
    val message: String?
)