package com.example.recyleviewnurfadillah

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.recycler_view_t, parent, false)) {

    private var imgView: ImageView? = null
    private var txtTitle: TextView? = null
    private var txtsubTitle: TextView? = null

    init {
        imgView = itemView.findViewById(R.id.img_view)
        txtTitle = itemView.findViewById(R.id.txt_title)
        txtsubTitle = itemView.findViewById(R.id.txt_title)
    }

    fun bind(data: pahlawan){
        imgView?.setImageResource(data.imgView)
        txtTitle?.text = data.txtTitle
        txtsubTitle?.text = data.txtSubTitle


    }
}