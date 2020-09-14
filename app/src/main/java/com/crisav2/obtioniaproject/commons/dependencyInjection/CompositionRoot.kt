package com.crisav2.obtioniaproject.commons.dependencyInjection

import android.app.Application
import com.crisav2.core.data.commons.ErrorsTable

class CompositionRoot(private val application: Application) {
    val errorsTable: ErrorsTable = ErrorsTable
}