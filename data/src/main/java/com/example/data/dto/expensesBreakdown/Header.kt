package com.example.data.dto.expensesBreakdown

import com.google.gson.annotations.SerializedName

data class Header(
    @SerializedName(value = "icon")
    val icon: Any?,

    @SerializedName(value = "label")
    val label: String?,

    @SerializedName(value = "labelType")
    val labelType: String?,

    @SerializedName(value = "title")
    val title: String?
)