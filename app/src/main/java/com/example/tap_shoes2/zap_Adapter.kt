package com.example.tap_shoes2

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tap_shoes2.databinding.ItemZapatillasBinding


    class zapAdapter(val zapatillas:List<ModelosZapatillas>, private val onClickListener:(ModelosZapatillas)
        -> Unit): RecyclerView.Adapter<zapAdapter.zapHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): zapHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return zapHolder(layoutInflater.inflate(R.layout.item_zapatillas, parent, false))
        }

        override fun getItemCount(): Int = zapatillas.size

        override fun onBindViewHolder(holder: zapHolder, position: Int) {
            val item =(zapatillas[position])
            holder.render(item,onClickListener)
        }

        class zapHolder(val view: View) : RecyclerView.ViewHolder(view) {

            val binding = ItemZapatillasBinding.bind(view)

            fun render(zapatillas: ModelosZapatillas,onClickListener: (ModelosZapatillas) -> Unit)  {
                binding.nombrezapatilla.text = zapatillas.nombreZapatilla
                binding.tvPreciozapatilla.text = zapatillas.precioZapatilla
                Glide.with(binding.imagenZapatilla).load(zapatillas.imagenZapatilla).into(binding.imagenZapatilla)

                  itemView.setOnClickListener{onClickListener(zapatillas)}

                  }
            }
        }

