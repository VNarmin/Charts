package com.example.data.dto.transactions

import com.google.gson.annotations.SerializedName

data class TransactionDTO(
    @SerializedName(value = "amount")
    val amount: Double?,

    @SerializedName(value = "category")
    val category: String?,

    @SerializedName(value = "currency")
    val currency: String?,

    @SerializedName(value = "date")
    val date: String?,

    @SerializedName(value = "merchant")
    val merchant: String?,

    @SerializedName(value = "time")
    val time: String?,

    @SerializedName(value = "id")
    val transactionID: String?,
)