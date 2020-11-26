package com.crisav2.core.repository

import com.crisav2.core.data.LoginUser

class UserServiceRepository(private val userService: UserService) {
    suspend fun doLogin(user: LoginUser) = userService.executeLogin(user)
}