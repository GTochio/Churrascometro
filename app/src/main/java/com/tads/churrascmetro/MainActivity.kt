package com.tads.churrascmetro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_calcular.setOnClickListener {

            val qtHomens = quantHomem.text.toString()
            val qtMulheres = quantMulher.text.toString()
            val qtCriancas = quantCriancas.text.toString()

            val intent = Intent(applicationContext, CalculoActivity::class.java)

            intent.putExtra("homens", qtHomens)
            intent.putExtra("mulheres", qtMulheres)
            intent.putExtra("criancas", qtCriancas)

            startActivity(intent)
        }
    }
}
