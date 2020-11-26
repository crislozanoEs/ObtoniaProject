package com.crisav2.core.usecase.ft00Login

import com.crisav2.core.data.LoginUser
import com.crisav2.core.repository.UserService

class Login(private val userService: UserService) {
    suspend operator fun invoke(user: LoginUser) = userService.executeLogin(user)
}