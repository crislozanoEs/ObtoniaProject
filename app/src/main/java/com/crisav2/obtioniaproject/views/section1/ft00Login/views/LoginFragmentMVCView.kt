package com.crisav2.obtioniaproject.views.section1.ft00Login.views

import androidx.lifecycle.LifecycleOwner
import com.crisav2.obtioniaproject.commons.views.ObservableMVCView
import com.crisav2.obtioniaproject.databinding.LoginFragmentBinding
import com.crisav2.obtioniaproject.views.section1.ft00Login.viewModel.LoginFragmentViewModel

interface LoginFragmentMVCView: ObservableMVCView<LoginFragmentMVCView.Listener, LoginFragmentBinding> {

    interface Listener{
        fun onLoginButtonClicked()
        fun onProblemsLoginButtonClicked()
        fun onFingerprintButtonClicked()
        fun onDocumentNumberTextChanged()
        fun onPasswordTextChanged();
    }
    var binding: LoginFragmentBinding
    fun setLifecycleOwner(lifecycleOwner: LifecycleOwner)
    fun setUserFieldError(error: Int)
    fun setPasswordFieldError(error: Int)
    fun setViewModel(viewModel: LoginFragmentViewModel)
}