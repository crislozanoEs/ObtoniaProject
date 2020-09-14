package com.crisav2.obtioniaproject.views.section1.ft00Login.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.crisav2.core.usecase.ft00Login.UserValidator

class LoginFragmentViewModelFactory(private val userValidator: UserValidator): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(LoginFragmentViewModel::class.java)){
            return LoginFragmentViewModel(userValidator) as T
        }
        throw IllegalArgumentException("Unknown viewModel class")
    }

}