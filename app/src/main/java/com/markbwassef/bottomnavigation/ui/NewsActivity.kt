package com.markbwassef.bottomnavigation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.markbwassef.bottomnavigation.R
import com.markbwassef.bottomnavigation.databinding.ActivityMainBinding


class NewsActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Init view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Get the fragment from the activity layout
        binding.bottomNavigationView.setupWithNavController(supportFragmentManager.findFragmentById(R.id.newsNavHostFragment)!!.findNavController())
    }
}