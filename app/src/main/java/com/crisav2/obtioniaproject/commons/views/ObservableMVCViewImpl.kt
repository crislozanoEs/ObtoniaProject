package com.crisav2.obtioniaproject.commons.views

import androidx.databinding.ViewDataBinding

open class ObservableMVCViewImpl<ListenerType, BindingType: ViewDataBinding>: MVCViewImpl<BindingType>(), ObservableMVCView<ListenerType, BindingType> {
    private val listeners = mutableSetOf<ListenerType>()

    override fun registerListener(listener: ListenerType) = listeners.add(listener)

    override fun unregisterListener(listener: ListenerType) = listeners.remove(listener)

    override fun getListeners(): Set<ListenerType>  = listeners
}