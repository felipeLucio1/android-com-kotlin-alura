package com.felipelucio.orgs.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.felipelucio.orgs.R
import com.felipelucio.orgs.model.Produto
import com.felipelucio.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listaProdutos = findViewById<RecyclerView>(R.id.lista_produtos)
        listaProdutos.adapter = ListaProdutosAdapter(this,
            listOf(
                Produto(
                    nome = "teste",
                    descricao = "descricao",
                    valor = BigDecimal("19.90")
                ),
                Produto(
                    nome = "teste",
                    descricao = "descricao",
                    valor = BigDecimal("19.90")
                ),
                Produto(
                    nome = "teste",
                    descricao = "descricao",
                    valor = BigDecimal("19.90")
                ),
            )
        )

        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }
    }
}