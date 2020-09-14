package com.crisav2.obtioniaproject.commons.views

import android.view.LayoutInflater
import android.view.ViewGroup
import com.crisav2.core.data.commons.ErrorsTable
import com.crisav2.obtioniaproject.views.section1.ft00Login.validators.LoginFragmentValidator
import com.crisav2.obtioniaproject.views.section1.ft00Login.views.LoginFragmentMVCView
import com.crisav2.obtioniaproject.views.section1.ft00Login.views.LoginFragmentMVCViewImpl

class MVCViewFactory(private val layoutInflater: LayoutInflater) {
    fun getLoginFragmentMVCView(parent: ViewGroup?, errorsTable: ErrorsTable): LoginFragmentMVCView = LoginFragmentMVCViewImpl(layoutInflater, parent, errorsTable)

}