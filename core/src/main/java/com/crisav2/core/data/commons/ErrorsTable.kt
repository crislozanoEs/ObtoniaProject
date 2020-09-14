package com.crisav2.core.data.commons

object ErrorsTable {
    private var errors: HashMap<Int,String> = HashMap<Int,String>()
    init {
        errors[0] = "Something went wrong! Please try again"
        errors[1] = "Incorrect document number/password"
        errors[10] = "The document number must no be empty"
        errors[11] = "The password must no be empty"
    }

    fun getErrors() = errors

}