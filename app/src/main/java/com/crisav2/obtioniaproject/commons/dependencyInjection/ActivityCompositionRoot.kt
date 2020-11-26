package com.crisav2.obtioniaproject.commons.dependencyInjection

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.crisav2.core.data.commons.ErrorsTable
import com.crisav2.obtioniaproject.network.sessionServices.SessionAPI

class ActivityCompositionRoot(private val compositionRoot: CompositionRoot, private val activity: AppCompatActivity) {

    fun getActivity() = activity
    fun getContext(): Context = getActivity().baseContext
    fun getErrorsTable(): ErrorsTable = compositionRoot.errorsTable
    fun getSessionAPI(): SessionAPI = compositionRoot.getSessionAPI()

}