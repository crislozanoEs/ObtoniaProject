package com.crisav2.obtioniaproject.views.section1.ft00Login.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.crisav2.core.data.LoginUser
import com.crisav2.core.data.commons.ErrorsTable
import com.crisav2.core.data.commons.ValidatorResponse
import com.crisav2.core.usecase.ft00Login.UserValidator
import com.crisav2.obtioniaproject.commons.Constants

class LoginFragmentViewModel(private val userValidator: UserValidator): ViewModel() {

    private enum class FIELD{
        PASSWORD, DOCUMENT
    }

    private var passwordValid = false
    private var userValid = false

    private val _formValid = MutableLiveData<Boolean>()
    val formValid: LiveData<Boolean>
        get() = _formValid

    val userIDString = MutableLiveData<String>()
    val userPasswordString = MutableLiveData<String>()


    private val _userLogin = MutableLiveData<LoginUser>()
    val userLogin: LiveData<LoginUser>
        get() = _userLogin


    init{
       evaluateFormValidation()
    }

    fun validateUserDocument(): Int = validateString(FIELD.DOCUMENT, userValidator.validateUserId(userIDString.value!!))
    fun validateUserPassword(): Int = validateString(FIELD.PASSWORD, userValidator.validateUserId(userPasswordString.value!!))


    private fun validateString(field: FIELD, response: ValidatorResponse): Int{
       when(field) {
           FIELD.PASSWORD -> passwordValid = response.valid
           FIELD.DOCUMENT -> userValid = response.valid
       }
        evaluateFormValidation()
        return if(response.valid)
            Constants.NOT_ERROR
        else
            response.errorCode

    }

    private fun evaluateFormValidation(){
        _formValid.value = userValid && passwordValid
    }
}