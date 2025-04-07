package com.example.mutlaq_studio

import android.app.Application
import com.stripe.android.PaymentConfiguration

class MutlaqApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        
        // Initialize Stripe
        PaymentConfiguration.init(
            applicationContext,
            "pk_test_your_publishable_key" // TODO: Replace with your Stripe publishable key
        )
    }
} 