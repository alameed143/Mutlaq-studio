package com.example.mutlaq_studio.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.mutlaq_studio.data.model.Product
import com.example.mutlaq_studio.ui.navigation.Screen
import com.example.mutlaq_studio.ui.viewmodel.CartViewModel

@Composable
fun ProductListingScreen(
    navController: NavController,
    cartViewModel: CartViewModel,
    category: String
) {
    // Dummy data - Replace with actual API call
    val products = remember {
        listOf(
            Product(
                id = "1",
                name = "Desert Sunset",
                nameAr = "Desert Sunset",
                description = "Beautiful desert sunset photograph",
                descriptionAr = "Beautiful image of a sunset in the desert",
                price = 299.99,
                imageUrl = "https://example.com/desert_sunset.jpg",
                category = "Photo Prints"
            ),
            Product(
                id = "2",
                name = "Arabic Calligraphy Art",
                nameAr = "Arabic Calligraphy",
                description = "Traditional Arabic calligraphy",
                descriptionAr = "Traditional Arabic Calligraphy Art",
                price = 499.99,
                imageUrl = "https://example.com/calligraphy.jpg",
                category = "Arabic Calligraphy"
            )
        )
    }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = category,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(16.dp)
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(products.filter { it.category == category }) { product ->
                ProductCard(
                    product = product,
                    onProductClick = {
                        navController.navigate(Screen.ProductDetail.createRoute(product.id))
                    },
                    onAddToCart = { cartViewModel.addToCart(product, "A4") }
                )
            }
        }
    }
}

@Composable
fun ProductCard(
    product: Product,
    onProductClick: () -> Unit,
    onAddToCart: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onProductClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column {
            AsyncImage(
                model = product.imageUrl,
                contentDescription = product.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier.padding(12.dp)
            ) {
                Text(
                    text = product.nameAr,
                    style = MaterialTheme.typography.titleMedium,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "${product.price} SAR",
                    style = MaterialTheme.typography.bodyMedium
                )

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = onAddToCart,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Add to Cart")
                }
            }
        }
    }
} 