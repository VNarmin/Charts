package com.example.data.dto.balanceDynamics

import com.google.firebase.firestore.PropertyName

data class BalanceOverviewDTO(
    @PropertyName(value = "balance")
    val balanceSnapshot: BalanceSnapshotDTO = BalanceSnapshotDTO(),

    @PropertyName(value = "filters")
    val filters: BalanceFiltersDTO = BalanceFiltersDTO()
)