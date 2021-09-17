package ru.startandroid.develop.myretrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.startandroid.develop.myretrofit.databinding.ActivityTwowindowBinding

class TwoWindowActivity: AppCompatActivity() {
    private lateinit var binding: ActivityTwowindowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTwowindowBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}