package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar os componentes TextInputEditText
        // Criar uma variavel e associar (=) o componete de UI < TextInputEditText >
        //recuperar o botão da tela

        val editPeso = findViewById<TextInputEditText>(R.id.edittext_peso)

        val editAltura = findViewById<TextInputEditText>(R.id.edittext_altura)

        val buttonCalcular = findViewById<Button>(R.id.button_calcular)

        buttonCalcular.setOnClickListener {

            val peso : Float = editPeso.text.toString().toFloat()

            val altura : Float = editAltura.text.toString().toFloat()

            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2

            println("acao do botao " + resultado)


        }

    }
}