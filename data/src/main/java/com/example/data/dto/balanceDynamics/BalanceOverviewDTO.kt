package com.example.data.dto.balanceDynamics

import com.google.gson.annotations.SerializedName

data class BalanceOverviewDTO(
    @SerializedName(value = "balance")
    val balance: BalanceSnapshotDTO?,

    @SerializedName(value = "filters")
    val filters: BalanceFiltersDTO?
)