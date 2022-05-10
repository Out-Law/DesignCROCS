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

class AdapterHorizontal(private var dataList: List<Int>)
    : RecyclerView.Adapter<AdapterHorizontal.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var img: ImageView = itemView.findViewById(R.id.imageView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.tem_cart_bag, parent, false)
        return AdapterHorizontal.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.img.setImageResource(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size
}