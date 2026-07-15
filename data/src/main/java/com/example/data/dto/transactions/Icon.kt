package com.example.data.dto.transactions

import com.google.gson.annotations.SerializedName

data class Icon(
    @SerializedName(value = "source")
    val source: String?,

    @SerializedName(value = "type")
    val type: String?
)