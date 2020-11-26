package com.crisav2.obtioniaproject.network.sessionServices

import com.crisav2.core.data.LoginUser
import com.crisav2.core.usecase.ft00Login.Login
import com.crisav2.obtioniaproject.commons.BaseObservable
import kotlinx.coroutines.*

class UserServiceUseCase(private val useCases: SessionUseCases): BaseObservable<UserServiceUseCase.Listener>() {

    interface Listener{
        fun loginSucceed(user: LoginUser)
        fun loginFailed()
    }
    private var job = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + job)


    fun executeLogin(user: LoginUser){
        uiScope.launch {
            executeDoLogin(user)
        }
    }

    private suspend fun executeDoLogin(user: LoginUser){
        withContext(Dispatchers.IO){
            try{
                useCases.doLogin(user)
                notifyLoginSucceed(user)
            }catch (e: Exception){
                notifyLoginFailed()
            }
        }
    }

    private fun notifyLoginFailed() {
        getListeners().forEach {
            it.loginFailed()
        }
    }

    private fun notifyLoginSucceed(user: LoginUser) {
        getListeners().forEach {
            it.loginSucceed(user)
        }
    }


}