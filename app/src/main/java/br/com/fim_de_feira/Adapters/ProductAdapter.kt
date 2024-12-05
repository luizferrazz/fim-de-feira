package br.com.fim_de_feira.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.RecyclerView
import br.com.fim_de_feira.R
import br.com.fim_de_feira.entities.Product

class ProductAdapter(private val products: List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productPriceTextView: TextView = itemView.findViewById(R.id.productPriceTextView)
        val productNameTextView: TextView = itemView.findViewById(R.id.productNameTextView)
        // ... outros TextViews para as demais informações do produto

        fun bind(product: Product) {
            // Carregar a imagem do produto (se tiver)
            // productImageView.setImageResource(product.imageResourceId)

            productPriceTextView.text = "R$ ${product.price}" // Formatação do preço
            productNameTextView.text = "${product.name}" // Formatação do preço

            // ... setar o texto para outros TextViews
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.prod_list_item, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(products[position])
    }

    override fun getItemCount(): Int {
        return products.size
    }
}