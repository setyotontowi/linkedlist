package com.trials.linkedlist

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AndroidModule(private val application: Application){

    // Important Notes no 3: Provides and Singleton in Module
    @Provides
    @Singleton
    fun provideApplicationContext(): Context = application

    @Provides
    @Singleton
    @Named("something")
    fun provideSomething(): String = "Something"

    @Provides
    @Singleton
    fun saySomething(): Hello = Hello()

}