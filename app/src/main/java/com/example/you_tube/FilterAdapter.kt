package com.example.you_tube

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class FilterAdapter(val context: Context, var items:ArrayList<Filter>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed_filter,parent,false)
        return FilterViewHolder(view)
    }

    class FilterViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var tv_filter: TextView

        init {
            tv_filter = view.findViewById(R.id.tv_title)
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val filter = items[position]

        if (holder is FilterViewHolder){
            var tv_title = holder.tv_filter
            tv_title.text = filter.title
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}