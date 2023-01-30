package com.example.dz6_month3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.dz6_month3.databinding.ItemContryBinding

class MusicAdapter(val countryList: ArrayList<Music>,val onclick:(position: Int)->Unit): Adapter<MusicAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemContryBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(countryList[position])
    }

    override fun getItemCount()= countryList.size



    inner class ViewHolder(private val binding: ItemContryBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(music: Music){
            itemView.setOnClickListener{
                onclick(adapterPosition)
            }
            val item = countryList[adapterPosition]

            binding.apply {
                countryView.text =item.country
                capitalView.text =item.capital
                timeCode.text =item.timeCode
                numView.text =item.num
            }
        }
    }
}