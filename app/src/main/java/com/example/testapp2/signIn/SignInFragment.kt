package com.example.testapp2.signIn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController

import com.example.testapp2.databinding.SignInFragmentBinding

class SignInFragment : Fragment() {
    private lateinit var binding: SignInFragmentBinding
    private val signInViewModel: SignInViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = SignInFragmentBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loginButton.setOnClickListener {
            findNavController().navigate(SignInFragmentDirections.actionSignInFragmentToLoginFragment())
        }
        binding.instaButton.setOnClickListener {
            findNavController().navigate(SignInFragmentDirections.actionSignInFragmentToAuthenticationFragment())
        }
        binding.googleButton.setOnClickListener {
            signInViewModel.productRequest(id = binding.et1.editText?.text.toString().toInt())
        }
        signInViewModel.liveData.observe(viewLifecycleOwner) { email ->
            binding.tv1.text = email
        }

    }
}