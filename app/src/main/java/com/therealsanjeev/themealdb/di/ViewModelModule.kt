package com.therealsanjeev.themealdb.di

import com.therealsanjeev.themealdb.fragment.viewmodel.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

    val viewModelModule = module {
    viewModel {
        MainViewModel(get(),get())
    }
}