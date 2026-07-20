package com.example.data.dto.balanceDynamics

import com.google.firebase.firestore.PropertyName

data class BalanceFiltersDTO(
    @PropertyName(value = "endDate")
    val endDate: String = "",

    @PropertyName(value = "granularity")
    val granularity: String = "",

    @PropertyName(value = "startDate")
    val startDate: String = ""
)