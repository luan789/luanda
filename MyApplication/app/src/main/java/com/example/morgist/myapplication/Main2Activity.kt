package com.example.morgist.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val list= arrayListOf("asdf","asd","asd","asd")
        for(item in list){
            Log.d("TAG","dem")
        }
        var mmm:recycleAdapter= recycleAdapter(list,this)
        recyle_view.layoutManager=LinearLayoutManager(this)
        recyle_view.adapter=mmm
        list.add(list.size-2,"luan")
        //mmm.notifyDataSetChanged()
    }
}
