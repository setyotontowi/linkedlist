package com.trials.linkedlist

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidModule::class])
interface AppComponent {

    fun inject(application: App)

    fun inject(mainActivity: MainActivity)
}