package br.com.fim_de_feira

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fim_de_feira.databinding.ActivityOrderdetailsBinding

class OrderDetailsActivity: AppCompatActivity() {

    private lateinit var binding: ActivityOrderdetailsBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderdetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}