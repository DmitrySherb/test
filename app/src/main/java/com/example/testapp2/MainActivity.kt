package com.example.testapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import com.example.testapp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("DimasLog","Димас не крутоgfhftghfghjй программас")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DimasLog","Димас очень крутой программас")
    }

    override fun onResume() {
        super.onResume()
        Log.d("DimasLog","Димас крутой программас")
    }

    override fun onStop() {
        super.onStop()
        Log.d("DimasLog","Димас крутой программас")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DimasLog","Димас крутой программас")
    }
}