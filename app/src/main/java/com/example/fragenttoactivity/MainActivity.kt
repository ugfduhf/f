package com.example.fragenttoactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() ,onItemClickListenerr{
    lateinit var rVm:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var arr = arrayListOf<Data>(
            Data("yasser"),
            Data("kook"),
            Data("yer"),
            Data("ser"),
            Data("hooser"),
            Data("dfadsf"),
            Data("yasasdferser"),
            Data("yarrrrrsseeer"),

        )
        rVm = findViewById(R.id.recyclerMain)
       var ad = NameAdapter(arr, this)
        rVm.adapter = ad
        rVm.layoutManager = LinearLayoutManager(this)
    }

    override fun onItemClickMy(data: Data) {
        //data.toString()
        //var data1 = "It is oke "

        Toast.makeText(this, data.name,Toast.LENGTH_SHORT).show()

        var bundle = Bundle()
        bundle.putString("name", data.name).toString()
        // this only show fragment not send to it data
        var nameFragment = supportFragmentManager
        var ft = nameFragment.beginTransaction()
        var fragment = FirstFragment()
        fragment.arguments = bundle
        ft.replace(R.id.fContainerV,fragment)
        ft.commit()
        //


    }


}