package br.com.cotemig.calculadoraimpostorenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var salario = findViewById<EditText>(R.id.salario)
        var btnCalc = findViewById<Button>(R.id.btncalc)
        var salarioLiquido = findViewById<TextView>(R.id.salarioliquido)
        var imposto = findViewById<TextView>(R.id.imposto)

        btnCalc.setOnClickListener {
            salarioLiquido.text = salario.text
        }
    }
}