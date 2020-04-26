@file:Suppress("UNREACHABLE_CODE")

package com.example.zvent.navigation.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zvent.R
import com.example.zvent.navigation.models.GuestAdapter
import com.example.zvent.navigation.models.Supplier
import kotlinx.android.synthetic.main.fragment_secon.*

class SeconFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_secon, container, false)

        val layoutManager = LinearLayoutManager(requireActivity())
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = GuestAdapter(activity!!, Supplier.guest)
        recyclerView.adapter = adapter
    }

}
