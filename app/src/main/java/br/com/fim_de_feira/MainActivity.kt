package br.com.fim_de_feira


import SupermarketAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.fim_de_feira.entities.Address
import br.com.fim_de_feira.entities.Costumer
import br.com.fim_de_feira.entities.Product
import br.com.fim_de_feira.entities.ServiceOrder
import br.com.fim_de_feira.entities.Supermarket

class MainActivity : AppCompatActivity() {

    private lateinit var supermarketAdapter: SupermarketAdapter
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.marketsRecyclerView)

        recyclerView.layoutManager = GridLayoutManager(this, 2)

        supermarketAdapter = SupermarketAdapter()
        recyclerView.adapter = supermarketAdapter
    }
}