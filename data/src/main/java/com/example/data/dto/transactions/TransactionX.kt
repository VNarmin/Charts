package com.example.data.dto.transactions

import com.google.gson.annotations.SerializedName

data class TransactionX(
    @SerializedName(value = "amount")
    val amount: String?,

    @SerializedName(value = "amountText")
    val amountText: String?,

    @SerializedName(value = "amountType")
    val amountType: String?,

    @SerializedName(value = "currency")
    val currency: String?,

    @SerializedName(value = "date")
    val date: String?
)