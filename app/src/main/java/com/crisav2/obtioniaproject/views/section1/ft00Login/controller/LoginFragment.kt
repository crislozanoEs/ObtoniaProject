package com.crisav2.obtioniaproject.views.section1.ft00Login.controller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.crisav2.obtioniaproject.commons.controllers.BaseFragment
import com.crisav2.obtioniaproject.views.section1.ft00Login.views.LoginFragmentMVCView

class LoginFragment(): BaseFragment() {

    private lateinit var mvcView: LoginFragmentMVCView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mvcView = controllerCompositionRoot?.getMVCViewFactory()?.getLoginFragmentMVCView(container)!!
        mvcView.setLifecycleOwner(this)

        return mvcView.getRootView()
    }

}