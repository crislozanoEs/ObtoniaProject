package com.crisav2.obtioniaproject.commons

import android.app.Application
import com.crisav2.obtioniaproject.commons.dependencyInjection.CompositionRoot

class CustomApplication : Application() {
    private lateinit var compositionRoot: CompositionRoot

    override fun onCreate() {
        super.onCreate()
        compositionRoot = CompositionRoot(this)
    }

    fun getCompositionRoot() = compositionRoot

}