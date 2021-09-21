package ru.startandroid.develop.myretrofit

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import ru.startandroid.develop.myretrofit.databinding.ActivityTwowindowBinding

class TwoWindowActivity: AppCompatActivity() {

    private lateinit var binding: ActivityTwowindowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTwowindowBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}