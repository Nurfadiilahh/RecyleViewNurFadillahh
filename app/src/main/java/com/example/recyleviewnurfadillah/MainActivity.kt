package com.example.recyleviewnurfadillah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun init() {
        recyclerView = findViewById(R.id.recycle_view)

        var data = ArrayList<pahlawan>()
        data.add(pahlawan(R.drawable.ahmadyani, txtTitle = "Ahmad Yani", txtSubTitle = "Ahmad Yani icon"))
        data.add(pahlawan(R.drawable.mtharyono, txtTitle = "MT Haryono", txtSubTitle = "MT Haryono icon"))
        data.add(pahlawan(R.drawable.panjaitan, txtTitle = "Panjaitan", txtSubTitle = "Panjaitan icon"))
        data.add(pahlawan(R.drawable.sparman, txtTitle = "S Parman", txtSubTitle = "S parman icon"))
        data.add(pahlawan(R.drawable.suprapto, txtTitle = "Suprapto", txtSubTitle = "Suprapto icon"))
        data.add(pahlawan(R.drawable.sutoyo, txtTitle = "Sutoyo", txtSubTitle = "Sutoyo icon"))
        data.add(pahlawan(R.drawable.tandean, txtTitle = "Tandean", txtSubTitle = "Tandean icon"))

        adapter=MyAdapter(data)
    }
}