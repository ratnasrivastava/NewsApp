package com.ratnasrivastava.newsapp.di.module

import android.content.Context
import com.ratnasrivastava.newsapp.NewsApplication
import com.ratnasrivastava.newsapp.di.ApplicationContext
import dagger.Module
import dagger.Provides

@Module
class NewsAppModule(private val application: NewsApplication) {

    @Provides
    @ApplicationContext
    fun provideApplicationContext(): Context {
        return application

    }
}