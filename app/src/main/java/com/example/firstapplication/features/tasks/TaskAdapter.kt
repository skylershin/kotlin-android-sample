package com.example.firstapplication.features.tasks

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.firstapplication.data.Task
import com.example.firstapplication.databinding.ViewTaskItemBinding
import com.example.firstapplication.ui.TaskViewHolder

/**
 * Created by munkyushin on 3/31/17.
 */
class TaskAdapter : RecyclerView.Adapter<TaskViewHolder> {

    val mTaskList: MutableList<Task>

    constructor() {
        mTaskList = arrayListOf()
    }

    fun addAll(tasks: List<Task>) {
        mTaskList.clear()
        mTaskList.addAll(tasks)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): TaskViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val itemBinding = ViewTaskItemBinding.inflate(layoutInflater, parent, false)

        return TaskViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: TaskViewHolder?, position: Int) {
        holder!!.bind(mTaskList[position])
    }

    override fun getItemCount(): Int {
        return mTaskList.size
    }

}
