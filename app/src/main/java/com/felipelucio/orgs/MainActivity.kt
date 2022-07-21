package com.felipelucio.orgs

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val produto = findViewById<TextView>(R.id.produto)
        val descricao = findViewById<TextView>(R.id.descricao)
        val valor = findViewById<TextView>(R.id.valor)

        produto.text = "Cesta de frutas"
        descricao.text = "Laranja, banana e uva"
        valor.text = "19,90"
    }
}