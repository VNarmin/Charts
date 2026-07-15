package com.example.data.dto.transactions

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName(value = "filters")
    val filters: Filters?,

    @SerializedName(value = "pagination")
    val pagination: Pagination?,

    @SerializedName(value = "tags")
    val tags: List<Any?>?,

    @SerializedName(value = "transactions")
    val transactions: List<Transaction>?
)