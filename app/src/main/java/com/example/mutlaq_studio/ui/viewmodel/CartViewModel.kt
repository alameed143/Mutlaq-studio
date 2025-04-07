package com.example.mutlaq_studio.ui.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.mutlaq_studio.data.model.CartItem
import com.example.mutlaq_studio.data.model.Product

class CartViewModel : ViewModel() {
    private val _cartItems = mutableStateListOf<CartItem>()
    val cartItems: List<CartItem> = _cartItems

    val totalPrice: Double
        get() = _cartItems.sumOf { it.product.price * it.quantity }

    fun addToCart(product: Product, size: String) {
        val existingItem = _cartItems.find { 
            it.product.id == product.id && it.selectedSize == size 
        }
        
        if (existingItem != null) {
            val index = _cartItems.indexOf(existingItem)
            _cartItems[index] = existingItem.copy(quantity = existingItem.quantity + 1)
        } else {
            _cartItems.add(CartItem(product, 1, size))
        }
    }

    fun removeFromCart(cartItem: CartItem) {
        _cartItems.remove(cartItem)
    }

    fun updateQuantity(cartItem: CartItem, quantity: Int) {
        if (quantity <= 0) {
            removeFromCart(cartItem)
            return
        }
        
        val index = _cartItems.indexOf(cartItem)
        if (index != -1) {
            _cartItems[index] = cartItem.copy(quantity = quantity)
        }
    }

    fun clearCart() {
        _cartItems.clear()
    }
} 