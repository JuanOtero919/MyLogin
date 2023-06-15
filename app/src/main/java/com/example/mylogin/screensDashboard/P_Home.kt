package com.example.mylogin.screensDashboard


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.navigation.NavHostController
import com.example.mylogin.recursos.FoodCard
import com.example.mylogin.recursos.FoodProduct

@Composable
fun ScreenHome(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {
        item {
            FoodCard(
                title = FoodProduct.Cafe.name,
                description = FoodProduct.Cafe.description,
                image = painterResource(FoodProduct.Cafe.image),
                onBuyClick = {
                    navController.navigate("PantallaProducto/${FoodProduct.Cafe.name}/${FoodProduct.Cafe.description}/${FoodProduct.Cafe.image}")
                }

            )
        }
        item {
            FoodCard(
                title = FoodProduct.Pan.name,
                description = FoodProduct.Pan.description,
                image = painterResource(FoodProduct.Pan.image),
                onBuyClick = {
                    navController.navigate("PantallaProducto/${FoodProduct.Pan.name}/${FoodProduct.Pan.description}/${FoodProduct.Pan.image}")
                }

            )
        }
        item {
            FoodCard(
                title = FoodProduct.Pastel.name,
                description = FoodProduct.Pastel.description,
                image = painterResource(FoodProduct.Pastel.image),
                onBuyClick = {
                    navController.navigate("PantallaProducto/${FoodProduct.Pastel.name}/${FoodProduct.Pastel.description}/${FoodProduct.Pastel.image}")
                }

            )
        }
    }
}

/*
@Composable
@Preview
fun PrevHome(){
    ScreenHome()
}*/