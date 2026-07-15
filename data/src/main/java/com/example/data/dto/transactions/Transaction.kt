package com.example.data.dto.transactions

import com.google.gson.annotations.SerializedName

data class Transaction(
    @SerializedName(value = "carbonFootprint")
    val carbonFootprint: Any?,

    @SerializedName(value = "cashback")
    val cashback: Any?,

    @SerializedName(value = "direction")
    val direction: String?,

    @SerializedName(value = "eligibleForAnalytics")
    val eligibleForAnalytics: Boolean?,

    @SerializedName(value = "id")
    val id: String?,

    @SerializedName(value = "includedInAnalytics")
    val includedInAnalytics: Boolean?,

    @SerializedName(value = "source")
    val source: Source?,

    @SerializedName(value = "status")
    val status: Status?,

    @SerializedName(value = "transaction")
    val transaction: TransactionX?
)