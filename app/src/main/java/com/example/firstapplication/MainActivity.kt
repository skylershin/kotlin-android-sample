package com.example.firstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myName: String = "munkyu"
        printLengthOf(myName)
    }

    fun printLengthOf(name: String) {
        val length = name.length
        setText(length.toString())
    }

    fun setText(text: String) {
        val textView = findViewById(R.id.text_view) as TextView
        textView.text = text // Is same with using setText() method.
    }

}
