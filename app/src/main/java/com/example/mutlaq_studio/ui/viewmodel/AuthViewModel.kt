package com.example.mutlaq_studio.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mutlaq_studio.data.repository.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class AuthViewModel : ViewModel() {
    private val userRepository = UserRepository()
    
    private val _authState = MutableStateFlow<AuthState>(AuthState.Idle)
    val authState: StateFlow<AuthState> = _authState

    sealed class AuthState {
        object Idle : AuthState()
        object Loading : AuthState()
        object Success : AuthState()
        data class Error(val message: String) : AuthState()
    }

    fun login(email: String, password: String) {
        _authState.value = AuthState.Loading
        // Simulate login success for now
        viewModelScope.launch {
            _authState.value = AuthState.Success
        }
    }

    fun register(name: String, email: String, password: String) {
        _authState.value = AuthState.Loading
        // Simulate registration success for now
        viewModelScope.launch {
            _authState.value = AuthState.Success
        }
    }

    fun resetAuthState() {
        _authState.value = AuthState.Idle
    }
} 