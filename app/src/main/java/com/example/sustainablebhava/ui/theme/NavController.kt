package com.example.sustainablebhava.ui.theme

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun setUpNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash"){
        composable("splash"){
            SplashScreen(navController)
        }
        composable("onBoard"){
            OnBoardInPage(navController)
        }
        composable("loginPage"){
            LogInPage()
        }
    }

}

