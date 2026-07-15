package com.example.data.dto.transactions

import com.google.gson.annotations.SerializedName

data class Pagination(
    @SerializedName(value = "hasNext")
    val hasNext: Boolean?,

    @SerializedName(value = "page")
    val page: Int?,

    @SerializedName(value = "size")
    val size: Int?,

    @SerializedName(value = "totalCount")
    val totalCount: Int?
)