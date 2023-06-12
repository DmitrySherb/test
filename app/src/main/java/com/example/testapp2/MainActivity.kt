package com.example.testapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.util.Log
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.testapp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController


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