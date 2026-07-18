package com.example.data.dto.cashback

import com.google.gson.annotations.SerializedName

data class CategoryCashbackDTO(
    @SerializedName(value = "cashback")
    val cashback: Double?,

    @SerializedName(value = "category")
    val category: String?
)