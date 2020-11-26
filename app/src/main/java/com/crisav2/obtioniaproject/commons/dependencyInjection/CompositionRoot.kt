package com.crisav2.obtioniaproject.commons.dependencyInjection

import android.app.Application
import com.crisav2.core.data.commons.ErrorsTable
import com.crisav2.obtioniaproject.commons.Constants
import com.crisav2.obtioniaproject.network.sessionServices.SessionAPI
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class CompositionRoot(private val application: Application) {
    val errorsTable: ErrorsTable = ErrorsTable

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    private var retrofit: Retrofit? = null
        get() {
            if(field == null){
                field = Retrofit.Builder()
                    .addConverterFactory(MoshiConverterFactory.create(moshi))
                    .addCallAdapterFactory(CoroutineCallAdapterFactory())
                    .baseUrl(Constants.BASE_URL)
                    .build()
            }
            return field
        }
    fun getSessionAPI(): SessionAPI = retrofit!!.create(SessionAPI::class.java)

}