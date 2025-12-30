package com.ratnasrivastava.newsapp

import android.app.Application
import com.ratnasrivastava.newsapp.di.DaggerNewsAppComponent
import com.ratnasrivastava.newsapp.di.NewsAppComponent
import com.ratnasrivastava.newsapp.di.module.NewsAppModule

class NewsApplication: Application() {

    lateinit var appComponent: NewsAppComponent
    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    private fun injectDependencies(){
        appComponent = DaggerNewsAppComponent
            .builder()
            .newsAppModule(NewsAppModule(this))
            .build()

            appComponent.inject(this)
    }
}