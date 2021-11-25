package com.example.sellpurchase.home

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sellpurchase.api.ItemApi
import com.example.sellpurchase.model.TransactionProperty
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel(){


    private val _properties = MutableLiveData<List<TransactionProperty>>()

    val properties:LiveData<List<TransactionProperty>>
    get() = _properties


    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)



    init {
        getTransactionalProperty()
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

    private fun getTransactionalProperty() {
        coroutineScope.launch {
            var getPropertiesDeferred = ItemApi.retrofitService.getProperties()

            try {
                var listResult = getPropertiesDeferred.await()

                if (listResult.size > 0){
                    _properties.value = listResult
                }
            }catch (t:Throwable){
                Log.d("Home", "$t is a error")
            }


        }

    }

}