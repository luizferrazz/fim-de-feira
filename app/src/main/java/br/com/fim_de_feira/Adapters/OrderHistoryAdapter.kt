package br.com.fim_de_feira.Adapters

import android.content.Context
import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import br.com.fim_de_feira.OrderDetailsActivity
import br.com.fim_de_feira.R
import br.com.fim_de_feira.entities.OrderHistory
import java.util.ArrayList

class OrderHistoryAdapter(private val context: Context): RecyclerView.Adapter<OrderHistoryAdapter.OrderHistoryViewHolder> () {

    private var orders: List<OrderHistory> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderHistoryViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.history_list_item, parent, false)
        return OrderHistoryViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return orders.size
    }

    override fun onBindViewHolder(holder: OrderHistoryViewHolder, position: Int) {
        holder.bind(orders[position])
    }

    fun setOrders(orders: List<OrderHistory>) {
        this.orders = orders
        notifyDataSetChanged()
    }

    inner class OrderHistoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val orderImage: ImageView = itemView.findViewById(R.id.marketHistoryXml)
        private val orderName: TextView = itemView.findViewById(R.id.orderHistoryNameText)
        private val orderDate: TextView = itemView.findViewById(R.id.orderHistoryNeighborhoodTextView)
        private val orderDetailsButton: Button = itemView.findViewById(R.id.btnDetails)

        fun bind(order: OrderHistory) {
            orderImage.setImageResource(R.drawable.logo_teste)
            orderName.text = order.supermarket
            orderDate.text = order.date

            orderDetailsButton.setOnClickListener {
                val intent = Intent(context, OrderDetailsActivity::class.java)
                context.startActivity(intent)
            }
        }
    }
}