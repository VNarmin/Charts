package com.example.data.dto.incomesExpenses

import com.google.gson.annotations.SerializedName

data class IncomesExpensesModel(
    @SerializedName(value = "data")
    val data: Data?,

    @SerializedName(value = "id")
    val id: String?,

    @SerializedName(value = "type")
    val type: String?
)