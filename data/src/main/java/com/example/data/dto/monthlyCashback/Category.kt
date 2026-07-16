package com.example.data.dto.monthlyCashback

import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName(value = "cashback")
    val cashback: Double?,

    @SerializedName(value = "category")
    val category: String?
)