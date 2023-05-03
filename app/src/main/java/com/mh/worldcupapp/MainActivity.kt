package com.mh.worldcupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.listView)

        val worldCupList = arrayOf(
            "Germany",
            "Brazil",
            "England",
            "Spain",
            "Qatar"
        )

        val arrayAdapter: ArrayAdapter<*> = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            worldCupList
        )

        listView.adapter = arrayAdapter

    }
}