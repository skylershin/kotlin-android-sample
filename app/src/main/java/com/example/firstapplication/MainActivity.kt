package com.example.firstapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

/**
 * Simple Search application
 *
 * 동료들의 이름을 리스트에 저장을 한다음
 * EditText를 활용해서 keyword를 받고
 * 검색하기 버튼을 눌러서 검색결과를 보여줍니다
 *
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchButton = findViewById(R.id.search_button) as Button

        searchButton.setOnClickListener {
            val searchKeywordEdit = findViewById(R.id.search_keyword_edit) as EditText
            val searchResultView = findViewById(R.id.search_result_view) as TextView
            val keyword = searchKeywordEdit.text.toString()

            searchResultView.text = getSearchResult(filter(keyword))
        }
    }

    fun filter(keyword: String): List<String> {
        val data = listOf<String>("munkyu", "ines", "amy", "lucy", "jason", "jack", "jeff", "clark", "kevin")

        return data.filter { name ->
            name.startsWith(keyword)
        }
    }

    fun getSearchResult(filteredData: List<String>): String {
        return filteredData.reduce{ current, next ->
            current + "\n" + next
        }
    }

}
