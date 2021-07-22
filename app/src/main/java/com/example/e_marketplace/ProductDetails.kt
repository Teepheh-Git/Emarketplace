package com.example.e_marketplace


import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.e_marketplace.databinding.ProductDetailsBinding

class ProductDetails : AppCompatActivity() {
    private lateinit var binding: ProductDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_details)
        binding = ProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent.getStringExtra("title")
        binding.productName.text = title

        binding.availability.setOnClickListener {
            AlertDialog.Builder(this)
                .setMessage("Hey, $title in stock!")
                .setPositiveButton("OK") { dialog, which ->
                }
                .create()
                .show()
        }

    }
}