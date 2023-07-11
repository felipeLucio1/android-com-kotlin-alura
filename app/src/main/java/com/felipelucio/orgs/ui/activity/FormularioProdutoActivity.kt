package com.felipelucio.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.felipelucio.orgs.R
import com.felipelucio.orgs.model.Produto
import java.math.BigDecimal

class FormularioProdutoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_produto)

        val salvarButton = findViewById<Button>(R.id.salvar_btn)
        salvarButton.setOnClickListener {
            val nomeEditText = findViewById<EditText>(R.id.nome)

            val descricaoEditText = findViewById<EditText>(R.id.descricao)

            val valorEditText = findViewById<EditText>(R.id.valor)
            val valor = when {
                valorEditText.text.isBlank() -> BigDecimal.ZERO
                else -> BigDecimal(valorEditText.text.toString())
            }

            val produto = Produto(
                nome = nomeEditText.text.toString(),
                descricao = descricaoEditText.text.toString(),
                valor = valor,
            )

            Log.i("nome", "$produto")
        }
    }
}