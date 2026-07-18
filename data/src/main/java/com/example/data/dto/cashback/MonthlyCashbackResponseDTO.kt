package com.example.data.dto.cashback

import com.google.gson.annotations.SerializedName

data class MonthlyCashbackResponseDTO(
    @SerializedName(value = "categories")
    val categories: List<CategoryCashbackDTO?>?,

    @SerializedName(value = "currency")
    val currency: String?,

    @SerializedName(value = "periodEnd")
    val periodEnd: String?,

    @SerializedName(value = "periodStart")
    val periodStart: String?
)