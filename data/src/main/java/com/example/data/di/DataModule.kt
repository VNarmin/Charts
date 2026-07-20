package com.example.data.di

import com.example.data.repository.BalanceDynamicsRepositoryImpl
import com.example.data.repository.CashFlowRepositoryImpl
import com.example.data.repository.CashbackRepositoryImpl
import com.example.data.repository.TransactionsRepositoryImpl
import com.example.domain.repository.BalanceDynamicsRepository
import com.example.domain.repository.CashFlowRepository
import com.example.domain.repository.CashbackRepository
import com.example.domain.repository.TransactionsRepository
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

val dataModule = module {
    single { Firebase.firestore }

    single<CoroutineDispatcher> { Dispatchers.IO }

    single<TransactionsRepository> {
        TransactionsRepositoryImpl(
            firestore = get(),
            dispatcher = get()
        )
    }

    single<BalanceDynamicsRepository> {
        BalanceDynamicsRepositoryImpl(
            firestore = get(),
            dispatcher = get()
        )
    }

    single<CashFlowRepository> {
        CashFlowRepositoryImpl(
            firestore = get(),
            dispatcher = get()
        )
    }

    single<CashbackRepository> {
        CashbackRepositoryImpl(
            firestore = get(),
            dispatcher = get()
        )
    }
}