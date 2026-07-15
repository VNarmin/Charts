package com.example.data.dto.transactions

import com.google.gson.annotations.SerializedName

data class Status(
    @SerializedName(value = "code")
    val code: String?,

    @SerializedName(value = "icon")
    val icon: Icon?,

    @SerializedName(value = "type")
    val type: String?
)