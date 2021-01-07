package com.example.android.navigation

import com.example.android.navigation.Model.Quotes
import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET ("quotes")
    fun FetchALLQuotes(): Call<List<Quotes>>
}