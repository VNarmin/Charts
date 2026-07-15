package com.example.data.dto.balanceHistory

import com.google.gson.annotations.SerializedName

data class Change(
    @SerializedName(value = "direction")
    val direction: String?,

    @SerializedName(value = "percentage")
    val percentage: String?
)