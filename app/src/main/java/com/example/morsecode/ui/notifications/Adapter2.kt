package com.example.morsecode.ui.notifications

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.morsecode.R

class Adapter2(val imageId: Array<Int>): RecyclerView.Adapter<Adapter2.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.model_no_button, parent, false))
    }
    override fun getItemCount(): Int {
        return imageId.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageIdView.setImageResource(imageId.get(position))

    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var imageIdView : ImageView = itemView.findViewById(R.id.image_view)

    }
}