package com.example.sellpurchase.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.sellpurchase.databinding.ViewObjBinding
import com.example.sellpurchase.model.TransactionProperty

class ItemsAdapter:ListAdapter<TransactionProperty,ItemsAdapter.ItemPropertyViewHolder>(DiffCallback) {

    companion object DiffCallback:DiffUtil.ItemCallback<TransactionProperty>(){
        override fun areItemsTheSame(
            oldItem: TransactionProperty,
            newItem: TransactionProperty
        ): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(
            oldItem: TransactionProperty,
            newItem: TransactionProperty
        ): Boolean {
            return oldItem.name==newItem.name
        }

    }
    class ItemPropertyViewHolder(private var binding:ViewObjBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(transactionProperty: TransactionProperty){
            binding.property = transactionProperty
            binding.executePendingBindings()
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemPropertyViewHolder {
        return ItemPropertyViewHolder(ViewObjBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ItemPropertyViewHolder, position: Int) {
        val transactionProperty = getItem(position)
        holder.bind(transactionProperty)
    }
}