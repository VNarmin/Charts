package com.example.data.dto.balanceDynamics

import com.google.firebase.firestore.PropertyName

data class BalanceSnapshotDTO(
    @PropertyName(value = "change")
    val change: BalanceChangeDTO = BalanceChangeDTO(),

    @PropertyName(value = "currency")
    val currency: String = "",

    @PropertyName(value = "history")
    val history: List<BalanceHistoryEntryDTO> = emptyList()
)