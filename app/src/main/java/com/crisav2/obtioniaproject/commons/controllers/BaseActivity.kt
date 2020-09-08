package com.crisav2.obtioniaproject.commons.controllers

import androidx.appcompat.app.AppCompatActivity
import com.crisav2.obtioniaproject.commons.CustomApplication
import com.crisav2.obtioniaproject.commons.dependencyInjection.ActivityCompositionRoot

open class BaseActivity: AppCompatActivity() {

    var activityCompositionRoot: ActivityCompositionRoot? = null
        private set
        get(){
            if(field == null){
                field = ActivityCompositionRoot((application as CustomApplication).getCompositionRoot(), this)
            }
            return field
        }

}