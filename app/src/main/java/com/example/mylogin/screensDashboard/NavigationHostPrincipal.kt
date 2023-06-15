package com.example.mylogin.screensDashboard

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mylogin.interfaces.ResumenPedidoScreen3
import com.example.mylogin.interfaces.ViewProducto
import com.example.mylogin.viewmodel.ViewProductoViewModel

@Composable
fun NavigationHostPrincipal(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = destinos.Pantalla1.ruta
    ){
        composable(destinos.Pantalla1.ruta){
            ScreenHome(navController)
        }

        composable(destinos.Pantalla2.ruta){
            ScreenDatos()
        }

        composable(destinos.Pantalla3.ruta){
            ScreenHistorial()
        }

        composable(destinos.Pantalla4.ruta){
            ScreenUbicacion()
        }

        composable(destinos.Pantalla5.ruta){
            ScreenMetodosPago()
        }

        composable(destinos.Pantalla6.ruta){
            ResumenPedidoScreen3()
        }
        /*
        composable(destinos.Pantalla7.ruta){
            ViewProducto(navController)
        }*/

        composable("PantallaProducto/{name}/{description}/{image}") { backStackEntry ->
            val productName = backStackEntry.arguments?.getString("name")
            val productDescription = backStackEntry.arguments?.getString("description")
            val productImage = backStackEntry.arguments?.getString("image")
            ViewProducto(navController, ViewProductoViewModel(), productName, productDescription, productImage)
        }


    }
}