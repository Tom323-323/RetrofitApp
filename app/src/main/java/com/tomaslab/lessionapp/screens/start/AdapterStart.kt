package com.tomaslab.lessionapp.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tomaslab.lessionapp.R
import com.tomaslab.lessionapp.model.nal.nalMoney
import kotlinx.android.synthetic.main.item_money.view.*

class AdapterStart: RecyclerView.Adapter<AdapterStart.StartViewHolder>(){

    var listStart = emptyList<nalMoney>()

    class StartViewHolder (view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money, parent,false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.item_name.text = listStart[position].Valute.EUR.Name
        holder.itemView.item_buy.text = listStart[position].Valute.EUR.Previous.toString()
        holder.itemView.item_sell.text = listStart[position].Valute.EUR.Value.toString()
    }

    override fun getItemCount(): Int {
        return listStart.size
    }


    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<nalMoney>){
        listStart = list
        notifyDataSetChanged()
    }
}