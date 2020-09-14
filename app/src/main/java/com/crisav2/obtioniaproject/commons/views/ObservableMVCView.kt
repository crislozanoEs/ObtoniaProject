package com.crisav2.obtioniaproject.commons.views

import androidx.databinding.ViewDataBinding

interface ObservableMVCView<ListenerType, BindingType: ViewDataBinding>: MVCView<BindingType> {
    fun registerListener(listener: ListenerType): Boolean
    fun unregisterListener(listener: ListenerType): Boolean
    fun getListeners(): Set<ListenerType>
}