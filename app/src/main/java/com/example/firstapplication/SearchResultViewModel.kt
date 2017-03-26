package com.example.firstapplication

/**
 * Created by munkyushin on 3/26/17.
 */
class SearchResultViewModel {
    fun filter(keyword: String): List<String> {
        val data = listOf<String>("munkyu", "ines", "amy", "lucy", "jason", "jack", "jeff", "clark", "kevin")

        return data.filter { name ->
            name.startsWith(keyword)
        }
    }
}
