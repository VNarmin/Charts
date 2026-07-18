package com.example.data.dto.transactions

import com.google.gson.annotations.SerializedName

data class TransactionsResponseDTO(
    @SerializedName(value = "periodEnd")
    val periodEnd: String?,

    @SerializedName(value = "periodStart")
    val periodStart: String?,

    @SerializedName(value = "transactions")
    val transactions: List<TransactionDTO?>?
)