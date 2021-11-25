package com.example.sellpurchase.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.sellpurchase.R
import com.example.sellpurchase.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private val viewModel:HomeViewModel by lazy{
        ViewModelProvider(this).get(HomeViewModel::class.java)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding :FragmentHomeBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)

        binding.lifecycleOwner = this

        binding.viewModel = viewModel

        binding.listOfItem.adapter = ItemsAdapter()

        binding.sellBtn.setOnClickListener{view:View ->
            view.findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToSell())
        }



        return binding.root
    }
}