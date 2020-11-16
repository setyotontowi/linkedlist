package com.trials.linkedlist

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AndroidModule(private val application: Application){
    @Provides
    @Singleton
    fun provideApplicationContext(): Context = application

    @Provides
    @Singleton
    @Named("something")
    fun provideSomething(): String = "Something"

}