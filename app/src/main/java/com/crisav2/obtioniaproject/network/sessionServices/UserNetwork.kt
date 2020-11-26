package com.crisav2.obtioniaproject.network.sessionServices

import com.crisav2.core.data.User
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class UserNetwork(
    @Json(name = "userID")
    var userID: String,
    @Json(name = "userIntID")
    var userIntID: String,
    @Json(name = "userTelID")
    var userTelID: String
)

fun UserNetwork.asDomainUser(): User {
    return User(
        userDocumentId = userID,
        userDigitalId = userIntID,
        userCompleteName = "",
        userLegalLastName = "",
        userFirstName = "",
        birthdayDate = ""
    )
}