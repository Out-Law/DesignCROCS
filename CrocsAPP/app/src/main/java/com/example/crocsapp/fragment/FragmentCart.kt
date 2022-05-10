package com.example.crocsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.crocsapp.Adapter.AdapterGrid
import com.example.crocsapp.Adapter.AdapterHorizontal
import com.example.crocsapp.Adapter.DataItem.ItemGridCard
import com.example.crocsapp.R

class FragmentCart : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cart, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val recyclerHome: RecyclerView = view.findViewById(R.id.Recycler_cart)

        recyclerHome.layoutManager = LinearLayoutManager(context)

        recyclerHome.adapter = AdapterHorizontal(
            listOf(
                R.drawable.img,
                R.drawable.img,
                R.drawable.img,
                R.drawable.img,
                R.drawable.img,
                R.drawable.img,
                R.drawable.img
            )
        )
    }
}