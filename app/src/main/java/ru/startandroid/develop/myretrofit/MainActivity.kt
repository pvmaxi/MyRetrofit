package ru.startandroid.develop.myretrofit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import ru.startandroid.develop.myretrofit.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        RetrofitClient.getClient().create(API::class.java).getUsers().enqueue(object : Callback<List<User>> {
            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                response.body()?.forEach {

                   val users = response.body() ?: listOf()
                    binding.users.adapter = UserAdapter(users)
                    Log.e("element", it.name)
                }
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                Log.e("retrofit", t.localizedMessage ?: "error")
            }

        })
    }
}

object RetrofitClient {
    private var retrofit: Retrofit? = null

    fun getClient(): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }
}

