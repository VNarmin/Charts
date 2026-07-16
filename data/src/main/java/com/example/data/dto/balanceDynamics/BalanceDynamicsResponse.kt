package com.example.data.dto.balanceDynamics

import com.google.gson.annotations.SerializedName

data class BalanceDynamicsResponse(
    @SerializedName(value = "7d")
    val last7days: Last7Days?,

    @SerializedName(value = "30d")
    val last30days: Last30Days?,

    @SerializedName(value = "24h")
    val last24hours: Last24Hours?,

    @SerializedName(value = "1y")
    val last12months: Last12Months?
)