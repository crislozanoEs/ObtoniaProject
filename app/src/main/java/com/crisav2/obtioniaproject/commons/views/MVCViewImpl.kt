package com.crisav2.obtioniaproject.commons.views

import android.content.Context
import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LifecycleOwner

open class MVCViewImpl<BindingType: ViewDataBinding>: MVCView<BindingType> {

    private lateinit var rootView: View

    override fun getRootView() = rootView

    override fun getContext(): Context = rootView.context

    override fun setLifecycleOwner(owner: LifecycleOwner, binding: BindingType) {
        binding.lifecycleOwner = owner
    }

    override fun setRootVies(view: View) {
        this.rootView = view
    }
}