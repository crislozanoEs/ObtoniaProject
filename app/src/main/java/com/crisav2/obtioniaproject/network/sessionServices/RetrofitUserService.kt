package com.crisav2.obtioniaproject.network.sessionServices

import com.crisav2.core.data.LoginUser
import com.crisav2.core.data.User
import com.crisav2.core.repository.UserService

class RetrofitUserService (private var sessionAPI: SessionAPI): UserService{
    override suspend fun executeLogin(user: LoginUser): User = sessionAPI.getUserLoginAsync().await().asDomainUser()
}