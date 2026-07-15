package com.example.data.dto.incomesExpenses

import com.google.gson.annotations.SerializedName

data class SecondTotal(
    @SerializedName(value = "color")
    val color: String?,

    @SerializedName(value = "label")
    val label: String?,

    @SerializedName(value = "value")
    val value: Double?
)