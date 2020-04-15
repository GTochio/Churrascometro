package com.tads.churrascmetro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculo.*

class CalculoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo)

        val dados: Bundle? = intent.extras

        val qt_homens = dados?.getString("homens")
        val qt_mulheres = dados?.getString("mulheres")
        val qt_criancas = (dados?.getString("criancas"))


        calcular(qt_homens.toString(), qt_mulheres.toString(), qt_criancas.toString())
        }


    fun calcular(qt_homens: String, qt_mulheres: String, qt_crianca: String){

        val numHomens = qt_homens.toInt()
        val numMulheres = qt_mulheres.toInt()
        val numCriancas = qt_crianca.toInt()

        var carne = 0.0
        var linguica = 0.0

        if (numHomens > 0) {

            carne = (0.3 * numHomens) + carne
            linguica = (0.1 * numHomens)+ linguica


        }
        if (numMulheres > 0) {

            carne = (0.25 * numMulheres) + carne
            linguica = (0.05 * numMulheres)+ linguica


        }
        if (numCriancas > 0) {

            carne = (0.180 * numCriancas) + carne
            linguica = (0.02 * numCriancas)+ linguica


        }


        linguica_text.setText(linguica.toString())
        carne_text.setText((carne.toString()))



    }
}


