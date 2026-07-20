package com.example.data.dto.transactions

import com.google.firebase.firestore.DocumentId
import com.google.firebase.firestore.PropertyName

// .toObject(TransactionDTO::class.java) includes 2 separate steps —
// initially — to instantiate the class with no data yet,
// Firestore needs an empty object shell to populate.
// then — to reflectively set each property,
// matching document field names to my property names one at a time.
data class TransactionDTO(
    @DocumentId val transactionID: String = "",

    @PropertyName(value = "amount")
    val amount: Double = 0.0,

    @PropertyName(value = "category")
    val category: String = "",

    @PropertyName(value = "currency")
    val currency: String = "",

    @PropertyName(value = "date")
    val date: String = "",

    @PropertyName(value = "merchant")
    val merchant: String = "",

    @PropertyName(value = "time")
    val time: String = ""
)