package com.example.mylogin.recursos

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.mylogin.R

sealed class FoodProduct(
    val name: String,
    val description: String,
    val image: Int
) {
    object Cafe : FoodProduct(
        name = "Café",
        description = "Delicioso café preparado con granos de alta calidad y un aroma irresistible. Disfruta de su sabor intenso y energizante.",
        image = R.drawable.cafe
    )

    object Pan : FoodProduct(
        name = "Pan",
        description = "Pan recién horneado con una textura esponjosa y un sabor irresistible. Ideal para acompañar tu desayuno o merienda.",
        image = R.drawable.pan
    )

    object Pastel : FoodProduct(
        name = "Pastel",
        description = "Un suculento pastel con capas de bizcocho esponjoso y un delicioso relleno. Perfecto para celebrar ocasiones especiales o simplemente darte un capricho.",
        image = R.drawable.pastel
    )
}








