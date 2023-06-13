package com.example.testapp2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.testapp2.databinding.LoginFragmentBinding

class LoginFragment:Fragment() {
    private lateinit var binding: LoginFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LoginFragmentBinding.inflate(layoutInflater)
        binding.backButton.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_signInFragment)}
        return binding.root



    }
}