package com.example.e_marketplace.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.e_marketplace.Product
import com.example.e_marketplace.ProductsAdapter
import com.example.e_marketplace.R
import com.example.e_marketplace.databinding.ActivityMainBinding
import com.example.e_marketplace.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.fragment_main,container, false)
        val products = arrayListOf<Product>()
        for (i in 0..100) {
            products.add(Product("Checked shirt #$i", "https://via.placeholder.com/350/dddddd/000000", 1.99))
        }



        binding = FragmentMainBinding.inflate(layoutInflater)


        binding.recyclerView.apply {

            layoutManager = GridLayoutManager(activity, 2)
            adapter = ProductsAdapter(products)
        }

        return root
    }
}