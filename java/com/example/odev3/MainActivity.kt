package com.example.odev3


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, NextActivity::class.java)

            intent.putExtra("tutar", binding.textViewNakit.text.toString())
            intent.putExtra("uye", binding.textViewUye.text.toString())
            intent.putExtra("cihaz", binding.textViewCihaz.text.toString())

            startActivity(intent)

        }
    }
}