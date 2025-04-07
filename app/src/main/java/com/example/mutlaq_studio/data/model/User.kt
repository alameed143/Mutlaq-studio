package com.example.mutlaq_studio.data.model

data class User(
    val id: String,
    val name: String,
    val email: String,
    val profilePicture: String? = null,
    val phoneNumber: String? = null,
    val addresses: List<Address> = emptyList(),
    val paymentMethods: List<PaymentMethod> = emptyList()
)

data class Address(
    val id: String,
    val label: String,
    val street: String,
    val city: String,
    val state: String,
    val postalCode: String,
    val country: String,
    val isDefault: Boolean = false
)

data class PaymentMethod(
    val id: String,
    val type: PaymentType,
    val lastFourDigits: String,
    val expiryDate: String,
    val isDefault: Boolean = false
)

enum class PaymentType {
    CREDIT_CARD,
    DEBIT_CARD,
    PAYPAL
} 