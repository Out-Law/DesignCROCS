package com.example.crocsapp.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.crocsapp.Adapter.AdapterGrid
import com.example.crocsapp.Adapter.DataItem.ItemGridCard
import com.example.crocsapp.R


class FragmentHome: Fragment() {

    private lateinit var  adapterGrid: AdapterGrid
    private var dataList = mutableListOf<ItemGridCard>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val recyclerHome: RecyclerView = view.findViewById(R.id.Recycler_home)

        recyclerHome.layoutManager = GridLayoutManager(context,2)

        recyclerHome.adapter = AdapterGrid(
            listOf(
                ItemGridCard("Title",R.drawable.crocs1),
                ItemGridCard("Title",R.drawable.crocs1),
                ItemGridCard("Title",R.drawable.crocs1),
                ItemGridCard("Title",R.drawable.crocs1),
                ItemGridCard("Title",R.drawable.crocs1),
                ItemGridCard("Title",R.drawable.crocs1),
                ItemGridCard("Title",R.drawable.crocs1),
                ItemGridCard("Title",R.drawable.crocs1),
                ItemGridCard("Title",R.drawable.crocs1),
                ItemGridCard("Title",R.drawable.crocs1)
            )
        )
    }
}