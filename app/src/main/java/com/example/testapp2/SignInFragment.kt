package com.example.testapp2

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.testapp2.databinding.SignInFragmentBinding

class SignInFragment : Fragment() {
    private lateinit var binding: SignInFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = SignInFragmentBinding.inflate(layoutInflater)
        binding.loginButton.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_loginFragment)
        }
        return binding.root



    }
}