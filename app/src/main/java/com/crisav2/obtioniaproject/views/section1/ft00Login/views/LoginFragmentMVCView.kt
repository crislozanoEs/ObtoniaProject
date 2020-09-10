package com.crisav2.obtioniaproject.views.section1.ft00Login.views

import androidx.lifecycle.LifecycleOwner
import com.crisav2.obtioniaproject.commons.views.ObservableMVCView
import com.crisav2.obtioniaproject.databinding.LoginFragmentBinding

interface LoginFragmentMVCView: ObservableMVCView<LoginFragmentMVCView.Listener, LoginFragmentBinding> {

    interface Listener{
    }
    var binding: LoginFragmentBinding
    fun setLifecycleOwner(lifecycleOwner: LifecycleOwner)
}