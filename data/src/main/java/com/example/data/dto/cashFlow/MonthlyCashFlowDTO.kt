package com.example.data.dto.cashFlow

import com.google.firebase.firestore.DocumentId
import com.google.firebase.firestore.PropertyName

data class MonthlyCashFlowDTO(
    @DocumentId val periodID: String = "",

    @PropertyName(value = "expense")
    val expense: Double = 0.0,

    @PropertyName(value = "income")
    val income: Double = 0.0,

    @PropertyName(value = "month")
    val period: String = ""
)