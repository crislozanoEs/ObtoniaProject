package com.crisav2.obtioniaproject.commons.dependencyInjection

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

class ActivityCompositionRoot(private val compositionRoot: CompositionRoot, private val activity: AppCompatActivity) {

    fun getActivity() = activity
    fun getContext(): Context = getActivity().baseContext

}