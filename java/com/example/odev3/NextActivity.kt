package com.example.odev3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev3.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val gelenTutar = intent.getStringExtra("tutar")
        val gelenUye = intent.getStringExtra("uye")
        val gelenCihaz = intent.getStringExtra("cihaz")

        binding.textViewGelen.text = "Gelen Tutar: $gelenTutar\nGelen Üye: $gelenUye\nGelen Cihaz: $gelenCihaz"

    }
}




