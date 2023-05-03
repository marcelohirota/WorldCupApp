package com.mh.worldcupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView: ListView = findViewById(R.id.listView)

        var adapter = MyAdapter(this, generateData())

        listView?.adapter = adapter
        adapter?.notifyDataSetChanged()


    }

    // Data Source
    fun generateData(): ArrayList<CountryModel>{
        var contriesList = ArrayList<CountryModel>()

        var country1 = CountryModel("Brazil", "5", R.drawable.brazil)
        var country2 = CountryModel("France", "2", R.drawable.france)
        var country3 = CountryModel("Germany", "4", R.drawable.germany)
        var country4 = CountryModel("Saudi Arabia", "0", R.drawable.saudiarabia)
        var country5 = CountryModel("Spain", "1", R.drawable.spain)
        var country6 = CountryModel("England", "1", R.drawable.unitedkingdom)
        var country7 = CountryModel("United States", "0", R.drawable.unitedstates)

        contriesList.add(country1)
        contriesList.add(country2)
        contriesList.add(country3)
        contriesList.add(country4)
        contriesList.add(country5)
        contriesList.add(country6)
        contriesList.add(country7)

        return contriesList
    }
}