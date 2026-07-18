package com.example.data.dto.balanceDynamics

import com.google.gson.annotations.SerializedName

data class BalanceSnapshotDTO(
    @SerializedName(value = "change")
    val change: BalanceChangeDTO?,

    @SerializedName(value = "currency")
    val currency: String?,

    @SerializedName(value = "history")
    val history: List<BalanceHistoryEntryDTO?>?
)