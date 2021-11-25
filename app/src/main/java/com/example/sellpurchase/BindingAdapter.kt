package com.example.sellpurchase

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.sellpurchase.home.ItemsAdapter
import com.example.sellpurchase.model.TransactionProperty

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView,data:List<TransactionProperty>?){
    val adapter = recyclerView.adapter as ItemsAdapter
    adapter.submitList(data)
}

@BindingAdapter("nameOfTheItem")
fun bindNameOfTheItem(tv:TextView,itemName:String){
    itemName?.let {
        tv.text = "$itemName"
    }
}

@BindingAdapter("entereDate")
fun bindDate(tv:TextView,date:String){
    tv.text = "$date"
}

@BindingAdapter("enterTime")
fun bindtime(tv:TextView,time:String){
    tv.text = "$time"
}

@BindingAdapter("enterName")
fun bindName(tv:TextView,name:String){
    tv.text = "$name"
}


@BindingAdapter("enterUnit")
fun bindUnit(tv:TextView,unit:String){
    tv.text = "$unit"
}

@BindingAdapter("enterQuantity")
fun bindQuantity(tv:TextView,qty:Int){
    tv.text = qty.toString()
}
@BindingAdapter("enterTotalPrice")
fun bindTotalPrice(tv:TextView,totalPrice:Int){
    tv.text = totalPrice.toString()
}

@BindingAdapter("entertypeOfTransaction")
fun bindtype(tv:TextView,typeOfTransaction:String){
    tv.text = "$typeOfTransaction"
}


