package com.felipelucio.orgs.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.felipelucio.orgs.R
import com.felipelucio.orgs.model.Produto

class ListaProdutosAdapter(
    private val context: Context,
    val listaProdutos: List<Produto>
) : RecyclerView.Adapter<ListaProdutosAdapter.ListaProdutosViewHolder>() {

    class ListaProdutosViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(produto: Produto) {
            val nomeProduto = itemView.findViewById<TextView>(R.id.produto)
            nomeProduto.text = produto.nome
            val descricaoProduto = itemView.findViewById<TextView>(R.id.descricao)
            descricaoProduto.text = produto.descricao
            val valorProduto = itemView.findViewById<TextView>(R.id.valor)
            valorProduto.text = produto.valor.toPlainString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaProdutosViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent, false)
        return ListaProdutosViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListaProdutosViewHolder, position: Int) {
        val produto = listaProdutos[position]
        holder.vincula(produto)
    }

    override fun getItemCount(): Int = listaProdutos.size

}
