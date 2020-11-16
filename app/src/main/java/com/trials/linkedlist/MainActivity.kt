package com.trials.linkedlist

import android.app.AppComponentFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.trials.mylibrary.Library
import java.lang.Exception
import javax.inject.Inject
import javax.inject.Named
import kotlin.reflect.KProperty

class MainActivity : AppCompatActivity() {

    @Inject lateinit var hello:Hello

    @field:[Inject Named("something")]
    lateinit var something: String

    @Inject lateinit var library: Library

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        App.component.inject(this)

        val text: TextView = findViewById(R.id.text)
        try {
            // TODO: Inject Hello Dagger
            text.text = library.text
        } catch (e: Exception){
            Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
        }
    }


}

