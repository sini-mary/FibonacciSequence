package com.example.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class valuesrvAdapter(var fibonacciList:List<Int>): RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.numberslist,parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        val currentValue = fibonacciList.get(position)
        holder,rvNumbers.text = currentValue.toString()
    }

    override fun getItemCount(): Int {
        return fibonacciList.size
    }
}


class NumbersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var rvNumber = itemView.findViewById<TextView>(R.id.rvNumbers)
}}
