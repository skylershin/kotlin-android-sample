package com.example.firstapplication

/**
 * Created by munkyushin on 3/26/17.
 */
object StringUtil {
    fun combineText(filteredData: List<String>): String {
        return filteredData.reduce{ current, next ->
            current + "\n" + next
        }
    }
}
