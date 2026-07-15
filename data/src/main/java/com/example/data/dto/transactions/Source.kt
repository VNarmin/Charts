package com.example.data.dto.transactions

import com.google.gson.annotations.SerializedName

data class Source(
    @SerializedName(value = "category")
    val category: String?,

    @SerializedName(value = "icon")
    val icon: Any?,

    @SerializedName(value = "note")
    val note: String?,

    @SerializedName(value = "subTitle")
    val subTitle: String?,

    @SerializedName(value = "title")
    val title: String?
)