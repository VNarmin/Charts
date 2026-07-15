package com.example.data.dto.incomesExpenses

import com.google.gson.annotations.SerializedName

data class Difference(
    @SerializedName(value = "label")
    val label: String?,

    @SerializedName(value = "value")
    val value: Double?
)