package com.example.data.dto.balanceDynamics

import com.google.firebase.firestore.PropertyName

data class BalanceChangeDTO(
    @PropertyName(value = "direction")
    val direction: String = "",

    @PropertyName(value = "percentage")
    val percentage: String = ""
)