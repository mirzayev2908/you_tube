package com.example.you_tube

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class FeedAdapter(var context:Context, var items:ArrayList<Feed>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
      val view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed_video,parent,false)
        return FeedViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
     val video=items[position]
     if(holder is FeedViewHolder){
         var iv_profile=holder.iv_profile
         var iv_image=holder.iv_image
         iv_profile.setImageResource(video.profile)
         iv_image.setImageResource(video.photo)
     }
    }

    override fun getItemCount(): Int {
       return items.size
    }

    class FeedViewHolder(view: View):RecyclerView.ViewHolder(view){
        var iv_profile:ShapeableImageView
        var iv_image:ImageView
        init {
            iv_profile=view.findViewById(R.id.iv_profile)
            iv_image=view.findViewById(R.id.iv_image)
        }
    }
}