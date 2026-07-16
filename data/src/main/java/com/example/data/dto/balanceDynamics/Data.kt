package com.example.data.dto.balanceDynamics

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName(value = "balance")
    val balance: Balance?,

    @SerializedName(value = "filters")
    val filters: Filters?
)