package com.example.data.dto.incomesExpenses

import com.google.gson.annotations.SerializedName

data class Header(
    @SerializedName(value = "difference")
    val difference: Difference?,

    @SerializedName(value = "firstTotal")
    val firstTotal: FirstTotal?,

    @SerializedName(value = "period")
    val period: String?,

    @SerializedName(value = "secondTotal")
    val secondTotal: SecondTotal?,

    @SerializedName(value = "unit")
    val unit: String?
)