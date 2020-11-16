package com.trials.linkedlist

import android.app.Application

open class App : Application() {

    // Important Note No 1: The Application's level file

    companion object {
        lateinit var component: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        createComponent()
    }

    protected open fun createComponent(){
        component = DaggerAppComponent.builder()
                // (#2) it should `create` or whatever interface in (#1) is
                .androidModule(AndroidModule(this))
                .build()

        // Questions.
        // I wonder if I create interface in AppComponent as Builder(#1) should (#2) Changed?

        component.inject(this)

    }

}
