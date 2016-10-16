package com.example.firstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setText(calculateRecArea().toString())
    }

    fun calculateRecArea(): Int {
        val width = 30
        val height = 12

        return area(width, height)
    }

    fun area(width: Int, height: Int): Int {
        return width * height
    }

    fun setText(text: String) {
        val textView = findViewById(R.id.text_view) as TextView
        textView.text = text // Is same with using setText() method.
    }

}
