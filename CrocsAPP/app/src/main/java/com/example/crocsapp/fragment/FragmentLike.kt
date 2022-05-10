package com.example.crocsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.crocsapp.Adapter.AdapterGrid
import com.example.crocsapp.Adapter.DataItem.ItemGridCard
import com.example.crocsapp.R

class FragmentLike : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_like, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val recyclerHome: RecyclerView = view.findViewById(R.id.Recycler_like)

        recyclerHome.layoutManager = GridLayoutManager(context,2)

        recyclerHome.adapter = AdapterGrid(
            listOf(
                ItemGridCard("Title",R.drawable.crocs1, R.drawable.ic__5),
                ItemGridCard("Title",R.drawable.crocs1, R.drawable.ic__5),
                ItemGridCard("Title",R.drawable.crocs1, R.drawable.ic__5),
                ItemGridCard("Title",R.drawable.crocs1, R.drawable.ic__5),
                ItemGridCard("Title",R.drawable.crocs1, R.drawable.ic__5),
                ItemGridCard("Title",R.drawable.crocs1, R.drawable.ic__5),
                ItemGridCard("Title",R.drawable.crocs1, R.drawable.ic__5),
                ItemGridCard("Title",R.drawable.crocs1, R.drawable.ic__5),
                ItemGridCard("Title",R.drawable.crocs1, R.drawable.ic__5),
                ItemGridCard("Title",R.drawable.crocs1, R.drawable.ic__5)
            )
        ){
            findNavController().navigate(R.id.action_fragmentLike_to_fragmentItem   )
        }
    }
}