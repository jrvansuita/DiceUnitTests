package com.vansuita.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.vansuita.dice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListeners()
        setupViewModel()
    }

    private fun setupViewModel() {
        viewModel.result.observe(this) {
            binding.textResult.text = it.toString()
        }
    }

    private fun setupListeners() {
        binding.buttonRoll.setOnClickListener {
            viewModel.execute()
        }
    }
}