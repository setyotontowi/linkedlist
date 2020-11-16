package com.trials.linkedlist

import android.app.AppComponentFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception
import javax.inject.Inject
import javax.inject.Named
import kotlin.reflect.KProperty

class MainActivity : AppCompatActivity() {

    @Inject lateinit var hello:Hello

    @field:[Inject Named("something")]
    lateinit var something: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        App.component.inject(this)

        val text: TextView = findViewById(R.id.text)
        try {
            text.text = something
        } catch (e: Exception){
            Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
        }
    }


}

