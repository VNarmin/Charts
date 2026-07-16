package com.example.data.dto.monthlyCashback

import com.google.gson.annotations.SerializedName

data class MonthlyCashbackResponse(
    @SerializedName(value = "categories")
    val categories: List<Category?>?,

    @SerializedName(value = "currency")
    val currency: String?,

    @SerializedName(value = "periodEnd")
    val periodEnd: String?,

    @SerializedName(value = "periodStart")
    val periodStart: String?
)