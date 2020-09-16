package com.crisav2.obtioniaproject.views.section1.ft00Login.views

import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.adapters.TextViewBindingAdapter
import androidx.lifecycle.LifecycleOwner
import com.crisav2.core.data.commons.ErrorsTable
import com.crisav2.obtioniaproject.R
import com.crisav2.obtioniaproject.commons.Constants
import com.crisav2.obtioniaproject.commons.views.ObservableMVCViewImpl
import com.crisav2.obtioniaproject.databinding.LoginFragmentBinding
import com.crisav2.obtioniaproject.views.section1.ft00Login.validators.LoginFragmentValidator
import com.crisav2.obtioniaproject.views.section1.ft00Login.viewModel.LoginFragmentViewModel

class LoginFragmentMVCViewImpl(layoutInflater: LayoutInflater,
                               parent: ViewGroup?,
                               private var errorsTable: ErrorsTable):
    LoginFragmentMVCView,
    ObservableMVCViewImpl<LoginFragmentMVCView.Listener, LoginFragmentBinding>() {

    override var binding: LoginFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.login_fragment, parent, false)

    init{
        super.setRootView(binding.root)
        binding.loginButton.setOnClickListener {
            publishOnLoginButtonClicked()
        }
        binding.problemsLoginButton.setOnClickListener {
            publishOnProblemsLoginButtonClicked()
        }
        binding.fingerprintLoginButton.setOnClickListener {
            publishOnFingerprintButtonClicked()
        }
        binding.documentNumberEdit.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Not Needed at the moment
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Not Needed at the moment
            }

            override fun afterTextChanged(p0: Editable?) {
                publishDocumentNumberTextChanged()
            }
        })

        binding.passwordEdit.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Not Needed at the moment
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Not Needed at the moment
            }

            override fun afterTextChanged(p0: Editable?) {
                publishOnPasswordTextChanged()
            }
        })
    }

    private fun publishDocumentNumberTextChanged() {
        getListeners().forEach {
            it.onDocumentNumberTextChanged()
        }
    }

    private fun publishOnPasswordTextChanged() {
        getListeners().forEach {
            it.onPasswordTextChanged()
        }
    }

    private fun publishOnFingerprintButtonClicked() {
        getListeners().forEach {
            it.onFingerprintButtonClicked()
        }
    }

    private fun publishOnProblemsLoginButtonClicked() {
        getListeners().forEach {
            it.onProblemsLoginButtonClicked()
        }
    }

    private fun publishOnLoginButtonClicked() {
        getListeners().forEach {
            it.onLoginButtonClicked()
        }
    }

    override fun setLifecycleOwner(lifecycleOwner: LifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner,binding)
    }

    override fun setUserFieldError(error: Int) {
        if (error == Constants.NOT_ERROR){
            binding.documentNumberEdit.error = null
        }else{
            binding.documentNumberEdit.error = errorsTable.getErrors()[error]
        }
    }

    override fun setPasswordFieldError(error: Int) {
        if (error == Constants.NOT_ERROR){
            binding.passwordEdit.error = null
        }else{
            binding.passwordEdit.error = errorsTable.getErrors()[error]
        }
    }

    override fun setViewModel(viewModel: LoginFragmentViewModel) {
        binding.loginViewModel = viewModel
    }

}