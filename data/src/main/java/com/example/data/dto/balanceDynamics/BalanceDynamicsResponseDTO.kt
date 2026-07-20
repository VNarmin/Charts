package com.example.data.dto.balanceDynamics

import com.google.firebase.firestore.DocumentId
import com.google.firebase.firestore.PropertyName

data class BalanceDynamicsResponseDTO(
    @DocumentId val period: String = "",

    @PropertyName(value = "data")
    val data: BalanceOverviewDTO = BalanceOverviewDTO(),

    @PropertyName(value = "message")
    val message: String = ""
)