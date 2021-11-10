package com.therealsanjeev.themealdb

import android.app.Application
import android.content.Context
import com.therealsanjeev.themealdb.di.appModule
import com.therealsanjeev.themealdb.di.repoModule
import com.therealsanjeev.themealdb.di.viewModelModule
import org.koin.android.ext.koin.androidContext

class App  : Application(){

    override fun onCreate() {
        super.onCreate()
        startModule()
    }

    private fun startModule() {
        org.koin.core.context.startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}