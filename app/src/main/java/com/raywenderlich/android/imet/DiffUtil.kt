package com.raywenderlich.android.imet

import android.support.v7.util.DiffUtil
import java.util.*


class DiffCallback<T>(private val oldList: List<T>?, private val newList: List<T>?) : DiffUtil.Callback() {

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldRelease = oldList?.get(oldItemPosition)
        val newRelease = newList?.get(newItemPosition)
        return Objects.equals(oldRelease, newRelease);
    }

    override fun getOldListSize(): Int = oldList?.size ?: 0

    override fun getNewListSize(): Int = newList?.size ?: 0


    override fun areContentsTheSame(p0: Int, p1: Int): Boolean = true
}