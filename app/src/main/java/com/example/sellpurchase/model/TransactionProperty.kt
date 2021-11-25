package com.example.sellpurchase.model

data class TransactionProperty (
    val date: String,
    val time:String,
    val name: String,
    val pricePerItem:Int,
    val unit:String,
    val quantity:Int,
    val totalPrice:Int,
    val TypeOfTransaction:String
)