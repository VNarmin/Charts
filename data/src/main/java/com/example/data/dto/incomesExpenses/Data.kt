package com.example.data.dto.incomesExpenses

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName(value = "chartData")
    val chartData: List<ChartData?>?,

    @SerializedName(value = "chartType")
    val chartType: String?,

    @SerializedName(value = "header")
    val header: Header?
)