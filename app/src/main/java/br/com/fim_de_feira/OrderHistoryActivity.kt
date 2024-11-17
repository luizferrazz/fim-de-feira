package br.com.fim_de_feira

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.fim_de_feira.Adapters.OrderHistoryAdapter
import br.com.fim_de_feira.databinding.ActivityOrderhistoryBinding
import br.com.fim_de_feira.entities.OrderHistory

class OrderHistoryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOrderhistoryBinding;
    private lateinit var recyclerView: RecyclerView;
    private lateinit var orderHistoryAdapter: OrderHistoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityOrderhistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.orderHistoryRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        orderHistoryAdapter = OrderHistoryAdapter()
        recyclerView.adapter = orderHistoryAdapter



    }
}