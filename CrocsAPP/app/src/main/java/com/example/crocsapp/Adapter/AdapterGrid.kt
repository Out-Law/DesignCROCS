package com.example.crocsapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.crocsapp.Adapter.DataItem.ItemGridCard
import com.example.crocsapp.R

class AdapterGrid (
    private var dataList: List<ItemGridCard>,
    private val onItemClick: () -> Unit
)
    : RecyclerView.Adapter<AdapterGrid.ViewHolder>(){

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.title)
        var img: ImageView = itemView.findViewById(R.id.img)
        var icon: ImageButton = itemView.findViewById(R.id.imageBLike)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_card_home, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = dataList[position]

        holder.title.text = data.title
        holder.img.setImageResource(data.img)
        holder.icon.setImageResource(data.icon)

        holder.itemView.setOnClickListener {
            onItemClick()
        }
    }

    override fun getItemCount(): Int = dataList.size
}