package com.trials.linkedlist

import android.content.Context
import com.trials.mylibrary.MyLibraryModule
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidModule::class, MyLibraryModule::class])
interface AppComponent {

    // Important Notes no 2: AppComponent as handler file

    // (#1) Build a builder like Kitties.AppComponent(interface Factory) line 26

    fun inject(application: App)

    fun inject(mainActivity: MainActivity)
}