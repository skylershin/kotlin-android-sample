package com.example.firstapplication.features.tasks

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.firstapplication.R
import com.example.firstapplication.data.Label
import com.example.firstapplication.data.SubTask
import com.example.firstapplication.data.Task
import kotlinx.android.synthetic.main.activity_tasks.*

class TasksActivity : AppCompatActivity() {
    lateinit var adapter: TaskAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasks)

        setSupportActionBar(toolbar)
//        supportActionBar?.title = "앞으로 할일"

        val task = Task("coding",
                mutableListOf<SubTask>(SubTask("test")),
                Label(R.color.colorAccent, "중요"))
        val tasks: MutableList<Task> = mutableListOf(task)

        adapter = TaskAdapter()
        adapter.addAll(tasks)
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)
    }
}
