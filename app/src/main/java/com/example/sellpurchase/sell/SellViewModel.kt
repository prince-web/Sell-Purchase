package com.example.sellpurchase.sell

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sellpurchase.model.TransactionProperty
import kotlinx.coroutines.launch
import retrofit2.Response
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class SellViewModel(transactionProperty: TransactionProperty,app:Application) : ViewModel(){

    val myResponse=MutableLiveData<Response<TransactionProperty>>()
    val current = LocalDate.now().toString()

    val formatter = DateTimeFormatter.ofPattern("HH:mm")
    val currentTime = LocalTime.now().format(formatter).toString()


    init {

    }




}