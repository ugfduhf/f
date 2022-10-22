package com.example.fragenttoactivity

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.View

class NameAdapter(var arrayListt: ArrayList<Data>,val listenerr: onItemClickListenerr) : RecyclerView.Adapter<NameAdapter.HolName>() {

     inner class HolName(itemView: View) : RecyclerView.ViewHolder(itemView) {
         var  tv_name :TextView= itemView.findViewById(R.id.textView)



//        init {
//            itemView.setOnClickListener(this)
//        }
//         override fun onClick(p0: View?) {
//
//             val position = adapterPosition
//
//             if (position != RecyclerView.NO_POSITION ){
//            listenerr.onItemClickMy(tv_name.text.toString())
//            }
//         }



         fun bind(data: Data,listenerr: onItemClickListenerr){
             //  this.tv_name.text = data.name
             tv_name.text = data.name
             //send data to activity only when press it
             itemView.setOnClickListener {
                 listenerr.onItemClickMy(data)
             }


     }


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolName {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.custom_name_layout,parent,false)
        return HolName(v)

    }
    override fun onBindViewHolder(holder: HolName, position: Int) {
        var vName = arrayListt[position]
        holder.bind(vName,listenerr)
    }
    override fun getItemCount(): Int {
       return arrayListt.size
    }


}