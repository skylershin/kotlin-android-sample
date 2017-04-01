package com.example.firstapplication

import android.content.Context
import android.content.SharedPreferences

/**
 * getSharedPreference and make some methods.
 * Created by munkyushin on 4/1/17.
 */
class PersistenceData(val context: Context) {
    val pref: SharedPreferences
    val editor: SharedPreferences.Editor

    init {
        val name = context.getString(R.string.preference_key)
        pref = context.getSharedPreferences(name, Context.MODE_PRIVATE)
        editor = pref.edit()
    }

    fun saveInt(key: String, value: Int) {
        editor.putInt(key, value).apply()
    }

    fun getInt(key: String): Int {
        return pref.getInt(key, 0)
    }

    fun saveString(key: String, value: String) {
        editor.putString(key, value).apply()
    }

    fun getString(key: String): String {
        return pref.getString(key, "")
    }

    fun saveBoolean(key: String, value: Boolean) {
        editor.putBoolean(key, value).apply()
    }

    fun getBoolean(key: String): Boolean {
        return pref.getBoolean(key, false)
    }
}
