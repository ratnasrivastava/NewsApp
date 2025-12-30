package com.ratnasrivastava.newsapp.di

import com.ratnasrivastava.newsapp.NewsApplication
import com.ratnasrivastava.newsapp.di.module.NewsAppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NewsAppModule::class])
interface NewsAppComponent {
    fun inject(application: NewsApplication)
}