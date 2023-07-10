package com.example.recyclerviewexample

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.databinding.ItemLookBinding

class Adapter(val list:ArrayList<Info>):RecyclerView.Adapter<Adapter.MyView>() {

    inner class MyView(val itemBinding:ItemLookBinding):RecyclerView.ViewHolder(itemBinding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        return MyView(ItemLookBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        holder.itemBinding.imgVw.setImageResource(list[position].image)
        holder.itemBinding.imgName.text = list[position].name
    }

    override fun getItemCount(): Int {
        return list.size
    }


}