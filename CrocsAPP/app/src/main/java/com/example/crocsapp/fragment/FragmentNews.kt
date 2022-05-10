package com.example.crocsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.crocsapp.Adapter.AdapterHorizontal
import com.example.crocsapp.Adapter.AdapterHorizontal1
import com.example.crocsapp.R

class FragmentNews : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val recyclerHome: RecyclerView = view.findViewById(R.id.Recycler_new)

        recyclerHome.layoutManager = LinearLayoutManager(context)

        recyclerHome.adapter = AdapterHorizontal1(
            listOf(
                R.drawable.img_2,
                R.drawable.img_3,
                R.drawable.img_2
            )
        )
    }
}