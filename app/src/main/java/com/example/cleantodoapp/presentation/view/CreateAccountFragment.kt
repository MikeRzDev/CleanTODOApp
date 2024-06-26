package com.example.cleantodoapp.presentation.view

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cleantodoapp.R
import com.example.cleantodoapp.presentation.viewmodel.CreateAccountViewModel

class CreateAccountFragment : Fragment() {

    private val viewModel: CreateAccountViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_create_account, container, false)
    }
}