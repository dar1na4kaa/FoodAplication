package com.example.foodaplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import authorization.AuthorizationScreen
import com.example.foodaplication.bottom_navigation.MainScreen
import com.example.foodaplication.ui.theme.FoodAplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodAplicationTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "authorization") {
                    composable("authorization") {
                        AuthorizationScreen {
                            navController.navigate("main_screen")
                        }
                    }
                    composable("main_screen") {
                        MainScreen()
                    }

                }
            }
        }
    }
}