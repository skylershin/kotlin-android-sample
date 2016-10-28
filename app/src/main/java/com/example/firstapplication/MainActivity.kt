package com.example.firstapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Calculate Karvonen heart rate. and then print them on TextView.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultTextView = findViewById(R.id.resultTextView) as TextView
        var result = ""
        for (intensity in 55..95 step 5) {
            val bpm = calculateKarvonen(intensity)
            result += "\n bpm : $bpm"
        }
        resultTextView.text = result
    }

    fun calculateKarvonen(intensity: Int): Int {
        return ((220 - 27) - (100 * intensity / 100)) + 100
    }
}
