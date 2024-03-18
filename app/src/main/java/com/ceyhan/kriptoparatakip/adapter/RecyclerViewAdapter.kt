package com.ceyhan.kriptoparatakip.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.ceyhan.kriptoparatakip.databinding.RecyclerRowBinding
import com.ceyhan.kriptoparatakip.model.CryptoModel

class RecyclerViewAdapter(val cryptoModels: ArrayList<CryptoModel>): RecyclerView.Adapter<RecyclerViewAdapter.RowHolder>() {

    class RowHolder(val binding: RecyclerRowBinding): ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return RowHolder(recyclerRowBinding)
    }

    override fun getItemCount(): Int {
        return cryptoModels.size
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        holder.binding.currency.text = cryptoModels[position].currency
        holder.binding.price.text = cryptoModels[position].price
    }
}