package com.example.myapplication.api

import com.example.myapplication.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SimpleAPI {
    @GET("{id}")
    fun getPhotoAccount(@Path("id") userString: String):  Call<List<User>>
}