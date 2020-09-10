package com.crisav2.obtioniaproject.commons.views

import android.view.LayoutInflater
import android.view.ViewGroup
import com.crisav2.obtioniaproject.views.section1.ft00Login.views.LoginFragmentMVCView
import com.crisav2.obtioniaproject.views.section1.ft00Login.views.LoginFragmentMVCViewImpl

class MVCViewFactory(private val layoutInflater: LayoutInflater) {

    fun getLoginFragmentMVCView(parent: ViewGroup?): LoginFragmentMVCView = LoginFragmentMVCViewImpl(layoutInflater, parent)

}