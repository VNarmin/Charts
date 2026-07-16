package com.example.data.dto.balanceDynamics

import com.google.gson.annotations.SerializedName

data class Last7Days(
    @SerializedName(value = "data")
    val data: Data?,

    @SerializedName(value = "message")
    val message: String?
)