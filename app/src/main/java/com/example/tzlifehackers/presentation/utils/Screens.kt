package com.example.tzlifehackers.presentation.utils

sealed class Screen(val route: String) {
    object MainScreen : Screen(MAIN_SCREEN)
    object CardScreen : Screen(CARD_SCREEN)
    object SplashScreen : Screen(SPLASH_SCREEN)

}