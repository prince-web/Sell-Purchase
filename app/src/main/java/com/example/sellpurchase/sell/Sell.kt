package com.example.sellpurchase.sell

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.sellpurchase.R
import com.example.sellpurchase.databinding.FragmentSellBinding
import com.example.sellpurchase.model.TransactionProperty

class Sell : Fragment(){
    private lateinit var viewModel: SellViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSellBinding = DataBindingUtil
            .inflate(inflater, R.layout.fragment_sell, container, false)

        binding.lifecycleOwner = this


        return binding.root
    }

}