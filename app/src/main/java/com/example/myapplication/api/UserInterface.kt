package com.example.myapplication.api

import com.example.myapplication.model.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserInterface {
    @POST("user")
    fun createAccount(@Body user: User): Call<User>
}