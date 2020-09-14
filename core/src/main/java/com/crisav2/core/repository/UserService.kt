package com.crisav2.core.repository

import com.crisav2.core.data.LoginUser
import com.crisav2.core.data.User

interface UserService {
    suspend fun executeLogin(user: LoginUser): User
}