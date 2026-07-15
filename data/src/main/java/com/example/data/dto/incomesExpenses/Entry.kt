package com.example.data.dto.incomesExpenses

import com.google.gson.annotations.SerializedName

data class Entry(
    @SerializedName(value = "label")
    val label: String?,

    @SerializedName(value = "value")
    val value: Double?,

    @SerializedName(value = "xLabel")
    val xLabel: String?
)