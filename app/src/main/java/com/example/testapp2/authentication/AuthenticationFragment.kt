package com.example.testapp2.authentication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import com.example.testapp2.adapter.ProductAdapter
import com.example.testapp2.databinding.AuthenticationFragmentBinding
import com.example.testapp2.databinding.SignInFragmentBinding
import com.example.testapp2.retrofit.AuthenticationApi
import com.example.testapp2.signIn.SignInFragmentDirections
import com.example.testapp2.signIn.SignInViewModel
import com.squareup.picasso.Picasso

class AuthenticationFragment : Fragment() {
    private lateinit var binding: AuthenticationFragmentBinding
    private val authenticationViewModel: AuthenticationViewModel by viewModels()
    private lateinit var adapter: ProductAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = AuthenticationFragmentBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            authenticationViewModel.authRequest(
                username = binding.username.text.toString(),
                password = binding.password.text.toString()
            )
        }
        authenticationViewModel.liveData.observe(viewLifecycleOwner) { user ->

            binding.firstName.text = user.firstName
            binding.lastName.text = user.lastName
            Picasso.get()
                .load(user.image)
                .into(binding.iv)
        }

        adapter = ProductAdapter()
        binding.rcView.layoutManager = LinearLayoutManager(context)
        binding.rcView.adapter = adapter
        authenticationViewModel.getAllProducts()

        authenticationViewModel.liveData2.observe(viewLifecycleOwner) { products ->

            adapter.submitList(products.products)
        }


    }
}