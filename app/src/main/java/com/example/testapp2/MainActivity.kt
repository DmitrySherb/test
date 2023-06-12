package com.example.testapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.util.Log
import android.view.View
import com.example.testapp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.googleButton.setOnClickListener {
            Log.d("DimasLog", "Димас не крутой программас")
        }
        binding.loginButton.setOnClickListener {
            val email: String = binding.et1.editText?.text.toString()
            val password: String = binding.et2.editText?.text.toString()
            Log.d("DimasLog", "Email:$email")
            Log.d("DimasLog", "Password:$password")
        }
    }


    override fun onPause() {
        super.onPause()
        Log.d("DimasLog", "Димас очень крутой программас")
    }

    override fun onResume() {
        super.onResume()
        Log.d("DimasLog", "Димас крутой программас")
    }

    override fun onStop() {
        super.onStop()
        Log.d("DimasLog", "Димас крутой программас")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DimasLog", "Димас крутой программас")
    }
}