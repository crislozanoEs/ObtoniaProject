package com.crisav2.obtioniaproject.commons

import com.crisav2.core.usecase.ft00Login.UserValidator
import com.crisav2.obtioniaproject.views.section1.ft00Login.viewModel.LoginFragmentViewModel
import com.crisav2.obtioniaproject.views.section1.ft00Login.viewModel.LoginFragmentViewModelFactory

class ViewModelFactory() {
    fun getLoginFragmentViewModelFactory(userValidator: UserValidator): LoginFragmentViewModelFactory = LoginFragmentViewModelFactory(userValidator)
}