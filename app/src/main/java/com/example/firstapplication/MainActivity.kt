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

        val munkyu = Person(name= "munkyu",age =  27)

        munkyu.sleep()
    }

}
