package com.example.crocsapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.crocsapp.R

class AdapterVertical(private val mList: MutableList<String>)
        : RecyclerView.Adapter<AdapterVertical.ViewHolder>(){

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            //val textView: TextView = itemView.findViewById(R.id.name_text)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_button_menu, parent, false)

            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val itemsViewModel = mList[position]
                // holder.textView.text = itemsViewModel
        }

        override fun getItemCount() = mList.size
    }
