package com.example.testapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        Log.d("DimasLog","Димас крутой программас")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DimasLog","Димас крутой программас")
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