package com.example.data.dto.expensesBreakdown

import com.google.gson.annotations.SerializedName

data class Icon(
    @SerializedName(value = "parameters")
    val parameters: Parameters?,

    @SerializedName(value = "source")
    val source: String?,

    @SerializedName(value = "type")
    val type: String?
)