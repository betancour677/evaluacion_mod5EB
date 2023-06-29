package com.example.tap_shoes2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.tap_shoes2.List_zapatillas.Companion.zapatillas
import com.example.tap_shoes2.databinding.FragmentDetallesBinding



class Detalles_fragment : Fragment() {
}

private lateinit var binding: FragmentDetallesBinding

    fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDetallesBinding.inflate(inflater,container,false)
        return binding.root
    }





