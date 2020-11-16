package com.trials.linkedlist

import android.app.Application

open class App : Application() {

    companion object {
        lateinit var component: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        createComponent()
    }

    protected open fun createComponent(){
        component = DaggerAppComponent.builder()
                .androidModule(AndroidModule(this))
                .build()

        component.inject(this)

    }

}
