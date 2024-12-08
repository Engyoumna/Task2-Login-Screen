package com.youmna.task

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.youmna.task.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        binding.editTextText5.setText("Youmna Zedan")
        binding.editTextText.setText("Person @gmail.com")
        binding.editTextText4.setText("0101234567")
        binding.editTextText3.setText("29/7/2004")
        binding.imageView.setImageResource(R.drawable.mg)
        binding.imageView2.setImageResource(R.drawable.shape1)
        binding.imageView4.setImageResource(R.drawable.back2)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}