package com.example.tap_shoes2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tap_shoes2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var adapter: zapAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.rvZapatillas.layoutManager = LinearLayoutManager(this)
        binding.rvZapatillas.adapter = zapAdapter(List_zapatillas.zapatillas) {onItemSelected(it) }

    }
    fun onItemSelected(zapatillas: ModelosZapatillas){

        val fragmentManager = supportFragmentManager
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, Detalles_fragment())
            .commit()
    }
}