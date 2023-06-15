package com.example.mylogin.screensDashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mylogin.R
import com.example.mylogin.recursos.FoodCard

@Composable
fun ScreenHome(){
    val cardTitle = "Pizza Hawaiana"
    val cardDescription = "Deliciosa pizza con jamón, piña y salsa de tomate"
    val cardImage: Painter = painterResource(R.drawable.imagenproducto)

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {
        item {
            FoodCard(
                title = cardTitle,
                description = cardDescription,
                image = cardImage,
                onBuyClick = { /* Acción al hacer clic en el botón Comprar */ }
            )
        }
        item {
            FoodCard(
                title = cardTitle,
                description = cardDescription,
                image = cardImage,
                onBuyClick = { /* Acción al hacer clic en el botón Comprar */ }
            )
        }
        item {
            FoodCard(
                title = cardTitle,
                description = cardDescription,
                image = cardImage,
                onBuyClick = { /* Acción al hacer clic en el botón Comprar */ }
            )
        }
    }
}

@Composable
@Preview
fun prevHome(){
    ScreenHome()
}