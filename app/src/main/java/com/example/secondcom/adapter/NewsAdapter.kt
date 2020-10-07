package com.example.secondcom.adapter

import android.content.ComponentCallbacks
import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(val context: Context, val listNews: List<news>)
    : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var datanews = listNews[position]
        holder.setdata
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    }
}