package com.example.e_marketplace

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.e_marketplace.databinding.ActivityMainBinding
import com.example.e_marketplace.databinding.ContentMainBinding
import com.example.e_marketplace.ui.MainFragment

class MainActivity : AppCompatActivity() {
     private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val toolbar: Toolbar = findViewById(R.id.toolbar)
//        setSupportActionBar(toolbar)
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, MainFragment())
            .commit()

//        binding.navView.setNavigationItemSelectedListener {
//            when (it.itemId) {
//                R.id.action_settings -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.frameLayout, MainFragment())
//                        .commit()
//                }
//
//                R.id.action_settings2 -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.frameLayout, MainFragment())
//                        .commit()
//                }
//            }
//
//            it.isChecked = true
//            binding.drawerLayout.closeDrawers()
//            true
//        }



        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24)
        }



    }
        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            binding.drawerLayout.openDrawer(GravityCompat.START)
            return true

    }


}