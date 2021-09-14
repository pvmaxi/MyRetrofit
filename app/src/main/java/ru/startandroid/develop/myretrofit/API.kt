package ru.startandroid.develop.myretrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

    interface API {

        @GET("users")
        fun getPosts(): Call<List<User>>

        @GET("users/{id}")
        fun getPost(
            @Path("id") id: Int
        ): Call<User>

    }


    data class User(
        val userId: Int,
        val id: Int,
        val title: String,
        val body: String
    )