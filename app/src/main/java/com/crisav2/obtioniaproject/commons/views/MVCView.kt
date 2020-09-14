package com.crisav2.obtioniaproject.commons.views

import android.content.Context
import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel

interface MVCView<BindingType: ViewDataBinding> {
    fun getRootView() : View
    fun setLifecycleOwner(owner: LifecycleOwner, binding: BindingType)
    fun setRootView(view: View)
    fun getContext(): Context
}