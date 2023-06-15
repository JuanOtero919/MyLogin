package com.example.mylogin.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mylogin.interfaces.Login2
import com.example.mylogin.interfaces.MyCustomViewInicio
import com.example.mylogin.interfaces.PantallaDashboard
import com.example.mylogin.interfaces.registro


@Composable
fun CoffecitoNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Coffecitoscream.overviewInicio.name
    ){
        composable(Coffecitoscream.overviewInicio.name){
            MyCustomViewInicio( navController = navController)
        }
        composable(Coffecitoscream.login.name){
            Login2( navController = navController)
        }
        composable( Coffecitoscream.MenuPrincipal.name)
        {
            PantallaDashboard()
        }
        composable( Coffecitoscream.Registro.name)
        {
            registro(navController=navController)
        }
    }
}
