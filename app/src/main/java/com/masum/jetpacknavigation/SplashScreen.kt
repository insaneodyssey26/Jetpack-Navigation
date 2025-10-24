package com.masum.jetpacknavigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationWithSplashScreen () {
    val navController = rememberNavController()
        NavHost(navController = navController, startDestination = 'splash_screen') {

        }
}

@Composable
fun SplashImage (modifier: Modifier = Modifier) {
    val navController by rememberNavController()
    NavHost(navController = navController, startDestination = "splash_screen") {
        composable ("splash_screen") {

        }
        composable ("main_screen") {

        }
    }
}