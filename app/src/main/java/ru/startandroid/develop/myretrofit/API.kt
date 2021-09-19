package ru.startandroid.develop.myretrofit

import android.provider.ContactsContract
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface API {
    @GET("users")
    fun getUsers(): Call<List<User>>

    @GET("users/{id}")
    fun getUser(
        @Path("id") id: Int
    ): Call<User>
}

data class User(
    val id: Int,
    val name: String,
    val username: String,
    val email: String
)