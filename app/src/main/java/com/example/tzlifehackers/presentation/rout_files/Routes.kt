package com.example.tzlifehackers.presentation.rout_files

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.tzlifehackers.presentation.Splash_screen.SplashScreen
import com.example.tzlifehackers.presentation.card_screen.CardScreen
import com.example.tzlifehackers.presentation.main_screen.MainScreen
import com.example.tzlifehackers.presentation.utils.Screen

@Composable
fun Routes(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {

        composable(
            route = Screen.MainScreen.route
        ) {
            MainScreen(navController = navController)
        }
        composable(
            route = Screen.CardScreen.route + "/{cardId}",
            arguments = listOf(navArgument("cardId") {
                type = NavType.IntType
            })
        ) {
            CardScreen(
                navController = navController
            )
        }
        composable(
            route = Screen.SplashScreen.route
        ){
            SplashScreen(navController = navController)
        }
    }
}