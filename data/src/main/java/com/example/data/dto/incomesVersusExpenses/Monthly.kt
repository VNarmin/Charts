package com.example.data.dto.incomesVersusExpenses

import com.google.gson.annotations.SerializedName

data class Monthly(
    @SerializedName(value = "expense")
    val expense: Double?,

    @SerializedName(value = "income")
    val income: Double?,

    @SerializedName(value = "month")
    val month: String?
)