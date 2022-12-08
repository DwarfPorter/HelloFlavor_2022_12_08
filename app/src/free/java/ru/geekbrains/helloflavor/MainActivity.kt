package ru.geekbrains.helloflavor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.geekbrains.helloflavor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text1.text = BuildConfig.MY_BUIL_TYPE
        binding.text2.text = getString(R.string.my_build_type)
    }
}