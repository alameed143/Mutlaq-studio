package com.example.mutlaq_studio.data.repository

import com.example.mutlaq_studio.data.api.AuthService
import com.example.mutlaq_studio.data.model.User
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class UserRepository {
    private val _currentUser = MutableStateFlow<User?>(null)
    val currentUser: StateFlow<User?> = _currentUser

    private var authToken: String? = null

    fun isLoggedIn(): Boolean = _currentUser.value != null

    fun getCurrentUser(): User? = _currentUser.value

    fun getAuthToken(): String? = authToken

    fun logout() {
        _currentUser.value = null
        authToken = null
    }
} 