package com.example.morgist.myapplication

import android.content.Context
import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.item_recycleview.view.*
import kotlinx.android.synthetic.main.item_spiner.view.*

class recycleAdapter(val list: ArrayList<String>, val context: Context) : RecyclerView.Adapter<recycleAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.item_recycleview, p0, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
        p0.tb.text = list.get(p1)
        if (p1 == list.size - 1) {
            p0.tb.setBackgroundColor(Color.BLUE)
        }
        p0.tb.text = list.get(p1)
    }

    class MyViewHolder(textView: View) : RecyclerView.ViewHolder(textView) {
        val tb = textView.item_recycle
    }
}