package com.example.data.dto.cashFlow

import com.google.gson.annotations.SerializedName

data class CashFlowTrendDTO(
    @SerializedName(value = "monthly")
    val cashFlow: List<MonthlyCashFlowDTO?>?,

    @SerializedName(value = "currency")
    val currency: String?,

    @SerializedName(value = "periodEnd")
    val periodEnd: String?,

    @SerializedName(value = "periodStart")
    val periodStart: String?
)