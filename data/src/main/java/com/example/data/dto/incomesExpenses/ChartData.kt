package com.example.data.dto.incomesExpenses

import com.google.gson.annotations.SerializedName

data class ChartData(
    @SerializedName(value = "color")
    val color: String?,

    @SerializedName(value = "entries")
    val entries: List<Entry?>?
)