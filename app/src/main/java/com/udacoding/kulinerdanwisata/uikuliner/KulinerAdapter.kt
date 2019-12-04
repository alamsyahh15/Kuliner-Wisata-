package com.udacoding.kulinerdanwisata.uikuliner

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.udacoding.kulinerdanwisata.R
import kotlinx.android.synthetic.main.item_kuliner.view.*


class KulinerAdapter(val dataImage : Array<Int>, val dataTitle : Array<String>)
    : RecyclerView.Adapter<KulinerAdapter.MyHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view  = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_kuliner,parent,false)
        return MyHolder(view)
    }

    override fun getItemCount() = dataImage.size

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.onBind(dataImage[position],dataTitle[position])

    }

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(image: Int, title: String) {
            itemView.imageKuliner.setImageResource(image)
            itemView.titleKuliner.text = title
        }
    }
}