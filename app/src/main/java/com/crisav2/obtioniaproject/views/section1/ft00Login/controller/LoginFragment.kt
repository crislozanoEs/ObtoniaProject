package com.crisav2.obtioniaproject.views.section1.ft00Login.controller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.crisav2.core.data.commons.ValidatorResponse
import com.crisav2.obtioniaproject.commons.controllers.BaseFragment
import com.crisav2.obtioniaproject.views.section1.ft00Login.validators.LoginFragmentValidator
import com.crisav2.obtioniaproject.views.section1.ft00Login.viewModel.LoginFragmentViewModel
import com.crisav2.obtioniaproject.views.section1.ft00Login.viewModel.LoginFragmentViewModelFactory
import com.crisav2.obtioniaproject.views.section1.ft00Login.views.LoginFragmentMVCView

class LoginFragment(): BaseFragment(), LoginFragmentMVCView.Listener {

    private lateinit var mvcView: LoginFragmentMVCView
    private lateinit var viewModel: LoginFragmentViewModel
    private lateinit var viewModelFactory: LoginFragmentViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mvcView = controllerCompositionRoot?.getMVCViewFactory()?.getLoginFragmentMVCView(container, controllerCompositionRoot!!.getErrorsTable())!!
        viewModelFactory = controllerCompositionRoot?.getViewModelFactory()?.getLoginFragmentViewModelFactory(controllerCompositionRoot!!.getUserValidator())!!
        viewModel = ViewModelProvider(this, viewModelFactory).get(LoginFragmentViewModel::class.java)
        mvcView.setViewModel(viewModel)
        mvcView.setLifecycleOwner(this)
        return mvcView.getRootView()
    }

    override fun onStart() {
        mvcView.registerListener(this)
        super.onStart()
    }

    override fun onStop() {
        mvcView.unregisterListener(this)
        super.onStop()
    }

    override fun onLoginButtonClicked() {
        TODO("Not yet implemented")
    }

    override fun onProblemsLoginButtonClicked() {
        TODO("Not yet implemented")
    }

    override fun onFingerprintButtonClicked() {
        TODO("Not yet implemented")
    }

    override fun onDocumentNumberTextChanged() {
        mvcView.setUserFieldError(viewModel.validateUserDocument())
    }

    override fun onPasswordTextChanged() {
        mvcView.setPasswordFieldError(viewModel.validateUserPassword())
    }


}