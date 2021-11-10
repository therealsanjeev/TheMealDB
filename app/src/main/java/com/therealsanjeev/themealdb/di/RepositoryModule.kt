package com.therealsanjeev.themealdb.di

import com.therealsanjeev.themealdb.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single {
        MainRepository(get())
    }
}