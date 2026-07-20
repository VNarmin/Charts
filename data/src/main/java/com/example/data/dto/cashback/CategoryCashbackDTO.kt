package com.example.data.dto.cashback

import com.google.firebase.firestore.DocumentId
import com.google.firebase.firestore.PropertyName

data class CategoryCashbackDTO(
    @DocumentId val categoryID: String = "",

    @PropertyName(value = "cashback")
    val cashback: Double = 0.0,

    @PropertyName(value = "category")
    val category: String = ""
)