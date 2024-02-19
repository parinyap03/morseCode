package com.example.morsecode.ui

import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.morsecode.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MyAdapter(private val itemList: List<Item>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.image_view)
        val playButton: Button = view.findViewById(R.id.play_button)
        val layout = view.findViewById<LinearLayout>(R.id.layout)
    }

    data class Item(val imageResId: Int, val soundResId: Int)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.model, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.imageView.setImageResource(item.imageResId)

        holder.playButton.setOnClickListener {
            // Play audio for the corresponding image
            val mediaPlayer = MediaPlayer.create(holder.imageView.context, item.soundResId)
            mediaPlayer.start()
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}