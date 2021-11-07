package com.example.mobileproduct

import androidx.appcompat.app.AppCompatActivity
import com.example.mobileproduct.databinding.ActivityMainBinding
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.ItemAdapter
import com.example.mobileproduct.Data.DataSource
import com.example.mobileproduct.model.mobile


class MainActivity : AppCompatActivity() {
   lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        val intentName = intent.extras!!.getString("name")

        val dataset = DataSource().LoadProduct()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView.adapter = ItemAdapter(this, dataset)
        recyclerView.setHasFixedSize(true)

    }





}