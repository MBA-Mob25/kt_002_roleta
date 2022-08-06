package com.example.kt_003_roleta

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.math.absoluteValue


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Carregando o elemento do Botão contido na tela
        val random = findViewById<Button>(R.id.btn_submit)

        // Definido uma ação ao clicar no botão "Rodar"
        random.setOnClickListener {

            // Carregando o elemento onde o resultado será exibido
            val responseView = findViewById<TextView>(R.id.sorted_value)
            // Sorteando um valor aleatório através da biblioteca do Java
            val sorted = Random().nextInt(2)

            // Definindo o valor final contendo o resultado do valor sorteado
            print(sorted.absoluteValue.toString())
            responseView.text = getString(R.string.sorted_value) + " " + sorted.absoluteValue
        }
    }

}