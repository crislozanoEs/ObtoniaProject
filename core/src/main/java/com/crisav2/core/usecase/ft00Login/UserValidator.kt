package com.crisav2.core.usecase.ft00Login

import com.crisav2.core.data.commons.ValidatorResponse

class UserValidator() {
    fun validateUserId(userId: String): ValidatorResponse{
        return if(userId.isEmpty())
            ValidatorResponse(false, 10)
        else
            ValidatorResponse(true, 0)
    }

    fun validatePassword(password: String): ValidatorResponse{
        return if(password.isEmpty())
            ValidatorResponse(false, 11)
        else
            ValidatorResponse(true, 0)
    }



}