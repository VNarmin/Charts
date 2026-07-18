package com.example.data.dto.balanceDynamics

import com.google.gson.annotations.SerializedName

data class BalanceChangeDTO(
    @SerializedName(value = "direction")
    val direction: String?,

    @SerializedName(value = "percentage")
    val percentage: String?
)