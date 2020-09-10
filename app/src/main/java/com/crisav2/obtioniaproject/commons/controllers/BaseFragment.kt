package com.crisav2.obtioniaproject.commons.controllers

import androidx.fragment.app.Fragment
import com.crisav2.obtioniaproject.commons.dependencyInjection.ControllerCompositionRoot
import com.crisav2.obtioniaproject.views.section1.commons.activity.PublicActivity

open class BaseFragment(): Fragment() {

    var controllerCompositionRoot: ControllerCompositionRoot?=null
        private set
        get(){
            if(field == null){
                field = ControllerCompositionRoot((requireActivity() as BaseActivity).activityCompositionRoot)
            }
            return field
        }
}