package br.com.fim_de_feira

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.GridLayoutManager
import br.com.fim_de_feira.Adapters.ProductAdapter
import br.com.fim_de_feira.databinding.ActivityMainBinding
import br.com.fim_de_feira.entities.Product
import com.google.android.material.navigation.NavigationView
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navView: NavigationView
    private val firestore = FirebaseFirestore.getInstance()
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        fetchProductsFromFirestore()

        drawerLayout = binding.drawerLayout
        navView = binding.navView

        toggle = ActionBarDrawerToggle(
            this, drawerLayout, binding.toolbar,
            R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    true
                }

                R.id.nav_profile -> {
                    startActivity(Intent(this, ProfileActivity::class.java))
                    true
                }

                R.id.nav_search -> {
                    startActivity(Intent(this, SearchActivity::class.java))
                    true
                }

                R.id.nav_service_orders -> {
                    startActivity(Intent(this, OrderHistoryActivity::class.java))
                    true
                }

                R.id.nav_logout -> {
                    startActivity(Intent(this, LoginActivity::class.java))
                    finish()
                    true
                }

                else -> false
            }
        }
    }

    private fun setupRecyclerView() {
        binding.productsRecyclerView.layoutManager = GridLayoutManager(this, 2)
    }

    private fun fetchProductsFromFirestore() {
        firestore.collection("products")
            .get()
            .addOnSuccessListener { result ->
                val products = mutableListOf<Product>()
                result.documents.map {
                    val product = it.toObject(Product::class.java)
                    if (product != null) {
                        Log.d("Product", product.toString())
                        products.add(product)
                    }
                }

                Log.d("Products", "todos: $products")
                binding.productsRecyclerView.adapter = ProductAdapter(products)
            }
            .addOnFailureListener { e ->
                e.printStackTrace()
            }
        }
    }
