package com.crisav2.obtioniaproject.commons.dependencyInjection

import android.view.LayoutInflater
import com.crisav2.obtioniaproject.commons.views.MVCViewFactory

class ControllerCompositionRoot(private val activityCompositionRoot: ActivityCompositionRoot?) {

    private fun getLayoutInflater(): LayoutInflater = LayoutInflater.from(activityCompositionRoot?.getContext())
    fun getActivity() = activityCompositionRoot?.getActivity()
    fun getContext() = activityCompositionRoot?.getContext()
    fun getMVCViewFactory() = MVCViewFactory(getLayoutInflater())
}