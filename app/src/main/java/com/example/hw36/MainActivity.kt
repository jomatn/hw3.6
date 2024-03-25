package com.example.hw36

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hw33.FoodAdapter
import com.example.hw36.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foodList = listOf(
            Food( "Pasta", "pasta is italian food"),
            Food( "Sushi", "sushi is japan food"),
            Food("Kuurdak", "kuurdak is kyrgyz food")
        )

        val adapter = FoodAdapter(foodList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
