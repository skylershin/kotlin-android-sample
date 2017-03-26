package com.example.firstapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.firstapplication.StringUtil.combineText

/**
 * Simple Search application
 *
 * Save colleagues name to List,
 * Get keyword using EditText.
 * And Click the search button, Show the search results.
 */
class MainActivity : AppCompatActivity() {
    lateinit var mViewModel:SearchResultViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewModel = SearchResultViewModel();
        val searchButton = findViewById(R.id.search_button) as Button

        searchButton.setOnClickListener {
            val searchKeywordEdit = findViewById(R.id.search_keyword_edit) as EditText
            val searchResultView = findViewById(R.id.search_result_view) as TextView
            val keyword = searchKeywordEdit.text.toString()

            searchResultView.text = combineText(mViewModel.filter(keyword))
        }
    }
}
