package com.example.mylogin.screensDashboard


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mylogin.recursos.FoodCard
import com.example.mylogin.recursos.FoodProduct

@Composable
fun ScreenHome() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {
        item {
            FoodCard(
                title = FoodProduct.Cafe.name,
                description = FoodProduct.Cafe.description,
                image = painterResource(FoodProduct.Cafe.image),
                onBuyClick = { /* Acción al hacer clic en el botón Comprar */ }
            )
        }
        item {
            FoodCard(
                title = FoodProduct.Pan.name,
                description = FoodProduct.Pan.description,
                image = painterResource(FoodProduct.Pan.image),
                onBuyClick = { /* Acción al hacer clic en el botón Comprar */ }
            )
        }
        item {
            FoodCard(
                title = FoodProduct.Pastel.name,
                description = FoodProduct.Pastel.description,
                image = painterResource(FoodProduct.Pastel.image),
                onBuyClick = { /* Acción al hacer clic en el botón Comprar */ }
            )
        }
    }
}


@Composable
@Preview
fun PrevHome(){
    ScreenHome()
}