package com.example.sellpurchase.api

import com.example.sellpurchase.model.TransactionProperty
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.Deferred
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

val BASE_URL = "http://d67c-223-236-11-228.ngrok.io/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit =
    Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()
interface ItemApiService {
    @GET("")
    fun  getProperties(): Deferred<List<TransactionProperty>>
}

object ItemApi{
    val retrofitService:ItemApiService by lazy{
        retrofit.create(ItemApiService::class.java)
    }
}