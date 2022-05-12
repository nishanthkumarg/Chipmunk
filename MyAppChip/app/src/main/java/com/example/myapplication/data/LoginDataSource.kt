package com.example.myapplication.data

import com.example.myapplication.data.model.LoggedInUser
import java.io.IOException
import java.lang.Exception
import java.util.*

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {
	fun login(username: String?, password: String?): Result<LoggedInUser?> {
		return try {
			// TODO: handle loggedInUser authentication
			val fakeUser = LoggedInUser(
				UUID.randomUUID().toString(),
				"Jane Doe"
			)
			Result.Success<Any?>(fakeUser)
		} catch (e: Exception) {
			Result.Error(IOException("Error logging in", e))
		}
	}
	
	fun logout() {
		// TODO: revoke authentication
	}
	
	fun CheckFoLogin() {
		// TODO: revoke authentication
	}
	
	fun CreateauthKey() {
		// TODO: revoke authentication
	}
	
	fun SendToken() {
		// TODO: revoke authentication
	}
	
	fun gettSSHTok() {
		// TODO: revoke authentication
	}
	
	fun createSSH() {
		// TODO: revoke authentication
	}
	
	// TODO: revoke authentication
	val isLogin: Boolean
		get() =// TODO: revoke authentication
			false
}