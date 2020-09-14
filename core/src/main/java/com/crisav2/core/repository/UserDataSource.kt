package com.crisav2.core.repository

import com.crisav2.core.data.User

interface UserDataSource {
    suspend fun saveUser(user: User)
    suspend fun retrieveUser(): User
}