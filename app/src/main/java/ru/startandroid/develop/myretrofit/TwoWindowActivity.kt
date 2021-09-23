package ru.startandroid.develop.myretrofit

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
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

        val json = intent.getStringExtra("user")!!
        val user = Gson().fromJson(json, User::class.java)

        Toast.makeText(this, "${user.name}", Toast.LENGTH_SHORT).show()

        binding.nameId.text = user.id.toString()
        binding.name.text = user.name
        binding.username.text = user.username
        binding.email.text = user.email

    }
}