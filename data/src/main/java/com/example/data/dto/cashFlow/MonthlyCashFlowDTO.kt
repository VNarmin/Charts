package com.example.data.dto.cashFlow

import com.google.gson.annotations.SerializedName

data class MonthlyCashFlowDTO(
    @SerializedName(value = "expense")
    val expense: Double?,

    @SerializedName(value = "income")
    val income: Double?,

    @SerializedName(value = "month")
    val period: String?
)