package com.example.mutlaq_studio.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.mutlaq_studio.ui.screens.*
import com.example.mutlaq_studio.ui.viewmodel.CartViewModel

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Auth : Screen("auth")
    object Home : Screen("home")
    object Categories : Screen("categories")
    object ProductListing : Screen("products/{category}") {
        fun createRoute(category: String) = "products/$category"
    }
    object ProductDetail : Screen("product/{productId}") {
        fun createRoute(productId: String) = "product/$productId"
    }
    object Cart : Screen("cart")
    object Address : Screen("address")
    object Payment : Screen("payment")
    object OrderSummary : Screen("order_summary")
    object Profile : Screen("profile")
    object CustomArtRequest : Screen("custom_art_request")
}

@Composable
fun AppNavigation(navController: NavHostController) {
    val cartViewModel: CartViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(Screen.Splash.route) {
            SplashScreen(navController)
        }
        
        composable(Screen.Auth.route) {
            AuthScreen(navController)
        }
        
        composable(Screen.Home.route) {
            HomeScreen(navController)
        }
        
        composable(Screen.Categories.route) {
            CategoriesScreen(navController)
        }
        
        composable(
            route = Screen.ProductListing.route,
            arguments = listOf(navArgument("category") { type = NavType.StringType })
        ) { backStackEntry ->
            val category = backStackEntry.arguments?.getString("category") ?: ""
            ProductListingScreen(navController, cartViewModel, category)
        }
        
        composable(
            route = Screen.ProductDetail.route,
            arguments = listOf(navArgument("productId") { type = NavType.StringType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId")
            ProductDetailScreen(navController, productId, cartViewModel)
        }
        
        composable(Screen.Cart.route) {
            CartScreen(navController, cartViewModel)
        }
        
        composable(Screen.Address.route) {
            AddressScreen(navController)
        }
        
        composable(Screen.Payment.route) {
            PaymentScreen(navController)
        }
        
        composable(Screen.OrderSummary.route) {
            OrderSummaryScreen(navController)
        }
        
        composable(Screen.Profile.route) {
            ProfileScreen(navController)
        }
        
        composable(Screen.CustomArtRequest.route) {
            CustomArtRequestScreen(navController)
        }
    }
} 