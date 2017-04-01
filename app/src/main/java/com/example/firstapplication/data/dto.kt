package com.example.firstapplication.data

/**
 * Created by munkyushin on 3/31/17.
 */
data class Task(val title:String, val subtasks: MutableList<SubTask>?, val label: Label?)
data class SubTask(val title:String)

data class Label(val color: Int, val description: String)