package com.trials.mylibrary

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MyLibraryModule {

    @Provides
    @Singleton
    fun sayLibrary(): Library = Library()
}