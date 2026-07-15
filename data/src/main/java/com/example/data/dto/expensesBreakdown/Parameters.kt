package com.example.data.dto.expensesBreakdown

import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName(value = "shape")
    val shape: String?
)