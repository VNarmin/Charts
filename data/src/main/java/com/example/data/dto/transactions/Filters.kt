package com.example.data.dto.transactions

import com.google.gson.annotations.SerializedName

data class Filters(
    @SerializedName(value = "endDate")
    val endDate: String?,

    @SerializedName(value = "startDate")
    val startDate: String?
)