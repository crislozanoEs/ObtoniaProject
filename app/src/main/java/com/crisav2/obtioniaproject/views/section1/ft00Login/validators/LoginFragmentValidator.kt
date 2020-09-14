package com.crisav2.obtioniaproject.views.section1.ft00Login.validators

import android.text.Editable
import android.text.TextUtils
import android.widget.EditText
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.crisav2.obtioniaproject.databinding.LoginFragmentBinding

class LoginFragmentValidator(private val binding: LoginFragmentBinding) {

    private var isUserValid = false
    private var isPasswordValid = false
    private val editTextDocumentNumber: EditText = binding.documentNumberEdit
    private val editTextPassword: EditText = binding.passwordEdit

    val isFormValid: LiveData<Boolean>
        get() = _isFormValid

    private var _isFormValid = MutableLiveData<Boolean>()

    init{
        //binding.validator = this
        isUserValid = validateUserText()
        isPasswordValid = validatePasswordText()
        evaluateFormValidation()
    }

    private fun evaluateFormValidation() {
        _isFormValid.value = isUserValid && isPasswordValid
    }

    private fun validateUserText(): Boolean = !TextUtils.isEmpty(editTextDocumentNumber.text.toString())
    private fun validatePasswordText(): Boolean = !TextUtils.isEmpty(editTextPassword.text.toString())

    fun userValidator(editable: Editable){
        isUserValid = validateUserText()
        if(!isUserValid){
            editTextDocumentNumber.error = "The document number must not be empty"
        }else{
            editTextDocumentNumber.error = null
        }
    }

    fun passwordValidator(editable: Editable){
        isPasswordValid = validatePasswordText()
        if(!isPasswordValid){
            editTextPassword.error = "The password must not be empty"
        }else{
            editTextPassword.error = null
        }
    }
}