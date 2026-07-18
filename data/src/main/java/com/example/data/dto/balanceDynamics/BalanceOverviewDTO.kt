package com.example.data.dto.balanceDynamics

import com.google.gson.annotations.SerializedName

data class BalanceOverviewDTO(
    @SerializedName(value = "balance")
    val balanceSnapshot: BalanceSnapshotDTO?,

    @SerializedName(value = "filters")
    val filters: BalanceFiltersDTO?
)