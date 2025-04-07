package com.example.mutlaq_studio.data.api

import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    companion object {
        const val BASE_URL = "https://your-backend-url.com/api/" // TODO: Replace with your actual backend URL
    }

    // TODO: Add your API endpoints here
    @GET("products")
    suspend fun getProducts(): Response<List<Any>>

    @POST("orders")
    suspend fun createOrder(@Body order: Any): Response<Any>

    @POST("payments/create-payment-intent")
    suspend fun createPaymentIntent(@Body paymentData: Any): Response<Any>
} 