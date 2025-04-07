package com.example.mutlaq_studio.data.model

data class Product(
    val id: String,
    val name: String,
    val nameAr: String,
    val description: String,
    val descriptionAr: String,
    val price: Double,
    val imageUrl: String,
    val category: String,
    val availableSizes: List<String> = listOf("A4", "A3", "A2", "A1")
) 