package com.example.fragenttoactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class FirstFragment : Fragment() {

    private lateinit var name :String
    var ARG_NAME = "name"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bundle =Bundle().getBundle("name")
        bundle = arguments

        //  if (bundle != null)


        name= bundle?.get(ARG_NAME).toString()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v = inflater.inflate(R.layout.fragment_first, container, false)




        var tv_n:TextView = v.findViewById<TextView?>(R.id.textFragmentName)
        tv_n.text = name
        return v
    }


}