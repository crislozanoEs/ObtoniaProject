package com.crisav2.obtioniaproject.views.section1.ft00Login.views

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleOwner
import com.crisav2.obtioniaproject.R
import com.crisav2.obtioniaproject.commons.views.ObservableMVCViewImpl
import com.crisav2.obtioniaproject.databinding.LoginFragmentBinding

class LoginFragmentMVCViewImpl(layoutInflater: LayoutInflater,
                               parent: ViewGroup?):
    LoginFragmentMVCView,
    ObservableMVCViewImpl<LoginFragmentMVCView.Listener, LoginFragmentBinding>() {

    override var binding: LoginFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.login_fragment, parent, false)

    init{
        super.setRootView(binding.root)
    }

    override fun setLifecycleOwner(lifecycleOwner: LifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner, binding)
    }

}