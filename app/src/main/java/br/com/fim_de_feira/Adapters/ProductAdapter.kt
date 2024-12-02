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
        val productConsumeTextView: TextView = itemView.findViewById(R.id.productConsumeTextView)
        val productLogoImageView: ImageView = itemView.findViewById(R.id.productLogoImageView)
        val productNameTextView: TextView = itemView.findViewById(R.id.productNameTextView)
        val productPriceTextView: TextView = itemView.findViewById(R.id.supermarketNeighborhoodTextView) // Assuming this displays price
        val addToCartButton: AppCompatButton = itemView.findViewById(R.id.addToCartButton) // Assuming an ID for the button
        // ... outros TextViews para as demais informações do produto

        fun bind(product: Product) {
            // Carregar a imagem do produto (se tiver)
            // productImageView.setImageResource(product.imageResourceId)

            productConsumeTextView.text = product.consumeDays.toString() + " dias para consumir"
            productPriceTextView.text = "R$ ${product.price}" // Formatação do preço

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