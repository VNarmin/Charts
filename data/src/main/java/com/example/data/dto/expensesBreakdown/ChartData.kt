package com.example.data.dto.expensesBreakdown

import com.google.gson.annotations.SerializedName

data class ChartData(
    @SerializedName(value = "icon")
    val icon: Icon?,

    @SerializedName(value = "progress")
    val progress: Double?,

    @SerializedName(value = "progressColor")
    val progressColor: String?,

    @SerializedName(value = "title")
    val title: String?,

    @SerializedName(value = "value")
    val value: String?
)