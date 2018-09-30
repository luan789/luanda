package com.example.morgist.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CustomSpinAdapter(val context: Context, var list: Array<String>) : BaseAdapter() {
    val layoutInflater: LayoutInflater = LayoutInflater.from(context)
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view: View
        val holder: itemHolder
        if (p1 == null) {
            view = layoutInflater.inflate(R.layout.catalogy, p2, false)
            holder = itemHolder(view)
            view?.tag = holder
        } else {
            view = p1
            holder = view.tag as itemHolder
        }
        holder.lable.text = list.get(p0)
        return view
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = layoutInflater.inflate(R.layout.item_spiner, parent, false)
        val labe = view?.findViewById(R.id.item_textview) as TextView
        labe.text = list.get(position)
        return view
    }

    override fun getCount(): Int {
        return list.size
    }

    class itemHolder(row: View?) {
        val lable: TextView

        init {
            this.lable = row?.findViewById(R.id.txt) as TextView
        }
    }
}