package com.example.data.dto.expensesBreakdown

import com.google.gson.annotations.SerializedName

data class ExpensesBreakdownModel(
    @SerializedName(value = "data")
    val data: Data?,

    @SerializedName(value = "id")
    val id: String?,

    @SerializedName(value = "type")
    val type: String?
)