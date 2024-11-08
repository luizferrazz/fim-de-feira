import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.fim_de_feira.R
import br.com.fim_de_feira.entities.Supermarket

class SupermarketAdapter : RecyclerView.Adapter<SupermarketAdapter.SupermarketViewHolder>() {

    private var supermarkets: List<Supermarket> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SupermarketViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.mkt_list_item, parent, false)
        return SupermarketViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return supermarkets.size
    }

    override fun onBindViewHolder(holder: SupermarketViewHolder, position: Int) {
        holder.bind(supermarkets[position])
    }

    fun setSupermarkets(supermarkets: List<Supermarket>) {
        this.supermarkets = supermarkets
    }

    class SupermarketViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val supermarketLogo: ImageView = itemView.findViewById(R.id.supermarketLogoImageView)
        private val supermarketName: TextView = itemView.findViewById(R.id.supermarketNameTextView)
        private val supermarketNeighborhood: TextView = itemView.findViewById(R.id.supermarketNeighborhoodTextView)
        private val supermarketStatus: TextView = itemView.findViewById(R.id.supermarketStatusTextView)

        fun bind(supermarket: Supermarket) {
            supermarketLogo.setImageResource(R.drawable.logo_teste)
            supermarketName.text = supermarket.name
            supermarketNeighborhood.text = supermarket.address.neighborhood
            supermarketStatus.text = if (supermarket.status) "Aberto" else "Fechado"
        }
    }
}
