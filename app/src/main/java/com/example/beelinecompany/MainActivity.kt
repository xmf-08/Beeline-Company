package com.example.beelinecompany

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beelinecompany.databinding.ActivityMainBinding
import com.example.beelinecompany.utils.MyData
import java.util.function.BinaryOperator

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MyData.addTemplate()
    }
}