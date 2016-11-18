package com.example.firstapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView

/**
 * Simple search application.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = listOf("munkyu", "amy", "ines", "jack", "brown", "clark", "jason")

        val searchButton = findViewById(R.id.searchButton)
        searchButton.setOnClickListener {
            // Get searchKeyword on the search bar.
            // Then compare with data using startsWith().
            // If there are results matching keyword, show below a search bar

            val searchBar = findViewById(R.id.searchBar) as EditText
            val searchKeyword = searchBar.text.toString().trim()
            val searchResults = data.filter { name ->
                name.startsWith(searchKeyword)
            }

            val searchResult = searchResults.reduce { total, next ->
                total + "\n" + next
            }

            val searchResultView = findViewById(R.id.searchResultView)
            if (searchResultView is TextView) {
                searchResultView.text = searchResult
            }
        }
    }

}
