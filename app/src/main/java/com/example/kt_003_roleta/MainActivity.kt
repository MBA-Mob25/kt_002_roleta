package com.example.kt_003_roleta

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val random = findViewById<Button>(R.id.btn_submit)
        random.setOnClickListener {
            val responseView = findViewById<TextView>(R.id.sorted_value)
            val sorted = Random().nextInt(2)

            responseView.text = getString(R.string.sorted_value) + sorted.toString()
        }
    }
}