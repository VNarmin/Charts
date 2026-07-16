package com.example.data.dto.incomesVsExpenses

import com.google.gson.annotations.SerializedName

data class IncomesVsExpensesResponse(
    @SerializedName(value = "currency")
    val currency: String?,

    @SerializedName(value = "monthly")
    val monthly: List<Monthly?>?,

    @SerializedName(value = "periodEnd")
    val periodEnd: String?,

    @SerializedName(value = "periodStart")
    val periodStart: String?
)