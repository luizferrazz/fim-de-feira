package br.com.fim_de_feira.Adapters

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import br.com.fim_de_feira.R
import br.com.fim_de_feira.databinding.HistoryListItemBinding
import br.com.fim_de_feira.entities.OrderHistory
import java.util.ArrayList

class OrderHistoryAdapter(): RecyclerView.Adapter<OrderHistoryAdapter.OrderHistoryViewHolder> () {

    private var orders: List<OrderHistory> = ArrayList()

    // ViewHolder para representar cada item da lista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderHistoryViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.history_list_item, parent, false)
        return OrderHistoryViewHolder(itemView)
    }

    // ViewHolder para representar cada item da lista
    override fun getItemCount(): Int {
        return orders.size
    }
    // ViewHolder para representar cada item da lista
    override fun onBindViewHolder(holder: OrderHistoryViewHolder, position: Int) {
        holder.bind(orders[position])
    }
    fun setOrders(orders: List<OrderHistory>) {
        this.orders = orders
        notifyDataSetChanged()
    }


    class OrderHistoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val orderImage: ImageView = itemView.findViewById(R.id.marketHistoryXml)
        private val orderName: TextView = itemView.findViewById(R.id.orderHistoryNameText)
        private val orderDate: TextView = itemView.findViewById(R.id.orderHistoryNeighborhoodTextView)
        private val orderStatus: TextView = itemView.findViewById(R.id.verDetalhes)

        fun bind(order: OrderHistory) {
            orderImage.setImageResource(R.drawable.logo_teste)
            orderName.text = order.supermarket.toString()
            orderDate.text = order.date
            orderStatus.text = order.details

        }

    }
}