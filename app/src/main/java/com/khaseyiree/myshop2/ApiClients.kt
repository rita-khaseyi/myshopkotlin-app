package com.khaseyiree.myshop2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClients {
    var retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun<T> buildClient(apiInterface: Class<T>): T{
        return retrofit.create(apiInterface)
    }
}