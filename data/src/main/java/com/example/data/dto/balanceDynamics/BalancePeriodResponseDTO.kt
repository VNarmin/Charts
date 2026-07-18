package com.example.data.dto.balanceDynamics

import com.google.gson.annotations.SerializedName

data class BalancePeriodResponseDTO(
    @SerializedName(value = "data")
    val data: BalanceOverviewDTO?,

    @SerializedName(value = "message")
    val message: String?
)