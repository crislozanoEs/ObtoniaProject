package com.crisav2.obtioniaproject.commons.controllers

import androidx.fragment.app.Fragment
import com.crisav2.obtioniaproject.commons.dependencyInjection.ControllerCompositionRoot
import com.crisav2.obtioniaproject.views.section1.commons.activity.PublicActivity
import com.crisav2.obtioniaproject.views.section2.commons.activity.MainActivity

class BaseFragmentSection2(): Fragment() {

    var controllerCompositionRoot: ControllerCompositionRoot?=null
        private set
        get(){
            if(field == null){
                field = ControllerCompositionRoot((requireActivity() as MainActivity).activityCompositionRoot)
            }
            return field
        }
}