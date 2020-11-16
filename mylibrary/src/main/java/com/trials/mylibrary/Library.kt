package com.trials.mylibrary

import javax.inject.Inject

class Library @Inject constructor() {
    val text: String = "Hello Library"
}