package com.example.kt_003_roleta

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Carregando o elemento do Botão contido na tela
        val random = findViewById<Button>(R.id.btn_submit)

        // Definido uma ação ao clicar no botão "Rodar"
        random.setOnClickListener {

            // Carregando o elemento onde o resultado será exibido
            val responseView = findViewById<TextView>(R.id.sorted_value)
            // Carregando o valor preenchido pelo usuário
            val numberValue = findViewById<EditText>(R.id.number)

            // Verificando se o valor foi preenchido
            if (numberValue.text.isEmpty()) {
                // Retornando um texto mostrando que o valor deve ser preenchido
                responseView.text = getString(R.string.error_empty)
                return@setOnClickListener
            }

            // Capturando o valor preenchido pelo usuário
            val choiceNumber = numberValue.text.toString().toInt()

            // Verificando se o número preenchi esta contido no range permitido
            if (choiceNumber in 11 downTo -1) {
                // Sorteando um valor aleatório através da biblioteca do Java
                // Neste caso ele irá sortear valores de 0 até 10
                val sorted = Random().nextInt(11)
                println("Número sorteado foi $sorted e o usuáruo escolheu $choiceNumber")

                // Definindo o valor final contendo o resultado do valor sorteado
                if (sorted.toString() == numberValue.text.toString()) {
                    responseView.text = getString(R.string.sorted_match)
                } else {
                    responseView.text = getString(R.string.sorted_not_match)
                }
            } else {
                responseView.text = getString(R.string.range_error)
            }
        }
    }
}
