package com.example.academylesson

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.academylesson.databinding.ActivityItemPodcastBinding

class item_podcast : AppCompatActivity() {
    private val binding by lazy() {
        ActivityItemPodcastBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}