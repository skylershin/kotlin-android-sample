package com.example.firstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

/**
 * 1. Create a map saved user id and password.
 * 2. When user click the login button,
 *    get id and password that entered.
 * 3. Compare entered data to saved data.
 * 4. If they are same, Show "Success Login" message,
 * 5. else Show "Try again" message
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addLoginButtonClickListener()
    }

    private fun addLoginButtonClickListener() {
        val loginButton = findViewById(R.id.login_button) as Button
        loginButton.setOnClickListener { onClickLoginButton() }
    }

    private fun onClickLoginButton() {
        // Get a EditText instance.
        val idEdit = findViewById(R.id.id_edit_text) as EditText
        val passwordEdit = findViewById(R.id.password_edit_text) as EditText
        // Get a text inside the editTextView
        val id = idEdit.text.toString() // Munkyu
        val password = passwordEdit.text.toString() //12345
        // And Login!! 
        login(id, password)
    }

    private fun login(id: String, password: String) {
        // If you want to any person can't change data, create a immutable map.
        // In kotlin, provide a immutable map as default option.
        // If you want to change data later, create mutable map.
        // val mutableMap = mutableMapOf<String, Int>(Pair("munkyu", 12345), Pair("lucy", 1234))
        val immutableMap = mapOf<String, Int>(Pair("munkyu", 12345), Pair("lucy", 1234))
        // Inside a Map
        //
        //    key     value
        // ------------------
        // | munkyu | 12345 |
        // ------------------
        // | lucy   | 1234  |
        // ------------------

        // We are checking data in Map. If you saved data in network then you request login api.
        if (immutableMap.get(id).toString().equals(password)) {
            Toast.makeText(applicationContext, "Success Login", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(applicationContext, "Try again", Toast.LENGTH_SHORT).show()
        }
    }
}
