package com.example.data.dto.balanceDynamics

import com.google.gson.annotations.SerializedName

data class BalanceFiltersDTO(
    @SerializedName(value = "endDate")
    val endDate: String?,

    @SerializedName(value = "granularity")
    val granularity: String?,

    @SerializedName(value = "startDate")
    val startDate: String?
)