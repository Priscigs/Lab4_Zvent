package com.example.zvent.navigation.models

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zvent.R
import com.example.zvent.navigation.views.SeconFragment
import kotlinx.android.synthetic.main.fragment_secon.view.*

class GuestAdapter(val context: Context, val guest: List<Guest>) : RecyclerView.Adapter<GuestAdapter.MyViewGuest>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewGuest {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_secon, parent, false)
        return MyViewGuest(view)
    }

    override fun getItemCount(): Int {
        return guest.size //lista de invitados
    }

    override fun onBindViewHolder(holder: MyViewGuest, position: Int) {
        val guest = guest[position]
        holder.setData(guest, position)
    }

    inner class MyViewGuest(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun setData(guest: Guest?, pos: Int){
            itemView.guest_text.text = guest!!.name
            itemView.guest_text.text = guest!!.phone
            itemView.guest_text.text = guest!!.email
        }
    }
}