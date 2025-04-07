package com.example.mutlaq_studio.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.mutlaq_studio.ui.viewmodel.CartViewModel

@Composable
fun ProductDetailScreen(navController: NavController, productId: String?, cartViewModel: CartViewModel) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Product Detail Screen - Coming Soon")
    }
} 