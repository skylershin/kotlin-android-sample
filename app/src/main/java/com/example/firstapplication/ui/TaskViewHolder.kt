package com.example.firstapplication.ui

import android.support.v7.widget.RecyclerView
import com.example.firstapplication.data.Task
import com.example.firstapplication.databinding.ViewTaskItemBinding

/**
 * Created by munkyushin on 3/31/17.
 */
class TaskViewHolder(val mBinding: ViewTaskItemBinding) : RecyclerView.ViewHolder(mBinding.root) {
    fun bind(item: Task) {
        mBinding.task = item
        mBinding.executePendingBindings()
    }
}
