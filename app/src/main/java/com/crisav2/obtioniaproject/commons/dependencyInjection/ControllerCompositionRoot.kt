package com.crisav2.obtioniaproject.commons.dependencyInjection

import android.view.LayoutInflater
import com.crisav2.core.data.commons.ErrorsTable
import com.crisav2.core.usecase.ft00Login.Login
import com.crisav2.core.usecase.ft00Login.UserValidator
import com.crisav2.obtioniaproject.commons.ViewModelFactory
import com.crisav2.obtioniaproject.commons.views.MVCViewFactory
import com.crisav2.obtioniaproject.databinding.LoginFragmentBinding
import com.crisav2.obtioniaproject.network.sessionServices.RetrofitUserService
import com.crisav2.obtioniaproject.network.sessionServices.SessionAPI
import com.crisav2.obtioniaproject.network.sessionServices.SessionUseCases
import com.crisav2.obtioniaproject.views.section1.ft00Login.validators.LoginFragmentValidator

class ControllerCompositionRoot(private val activityCompositionRoot: ActivityCompositionRoot?) {

    private fun getLayoutInflater(): LayoutInflater = LayoutInflater.from(activityCompositionRoot?.getContext())
    fun getViewModelFactory(): ViewModelFactory = ViewModelFactory()
    fun getActivity() = activityCompositionRoot?.getActivity()
    fun getContext() = activityCompositionRoot?.getContext()
    fun getMVCViewFactory() = MVCViewFactory(getLayoutInflater())
    fun getUserValidator(): UserValidator = UserValidator()
    fun getErrorsTable(): ErrorsTable = activityCompositionRoot!!.getErrorsTable()
    private fun getSessionAPI(): SessionAPI = activityCompositionRoot!!.getSessionAPI()
    fun getSessionUseCases(): SessionUseCases = SessionUseCases(Login(RetrofitUserService(getSessionAPI())))


}