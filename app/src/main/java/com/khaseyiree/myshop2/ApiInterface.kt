package com.khaseyiree.myshop2

import android.telecom.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path


interface ApiInterface{
    @GET ("/product")
    fun getProducts(): retrofit2.Call<ProductsResponse>

    @GET ("/product/{id}")
    fun getProductById(@Path("id") productId:Int): retrofit2.Call<Product>

    @POST("/product")
    fun postProduct(@Body product: Product): retrofit2.Call<Product>


}