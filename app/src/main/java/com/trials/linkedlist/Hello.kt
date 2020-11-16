package com.trials.linkedlist

import javax.inject.Inject

class Hello @Inject constructor(){

    // Important Notes No 4 If you want to inject this to MainActivity, create interface module and
    //  use it here

    val text = "Hello Dagger"
}