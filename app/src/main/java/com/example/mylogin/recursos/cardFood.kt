package com.example.mylogin.recursos
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mylogin.R

@Composable
fun FoodCard(
    image: Painter,
    title: String,
    description: String,
    onBuyClick: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = 4.dp,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Inside
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = title, style = MaterialTheme.typography.h6)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = description, style = MaterialTheme.typography.body2)
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { onBuyClick() },
                modifier = Modifier.align(Alignment.End),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "Comprar")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    val cardTitle = "Pizza Hawaiana"
    val cardDescription = "Deliciosa pizza con jamón, piña y salsa de tomate"
    val cardImage: Painter = painterResource(R.drawable.imagenproducto)

    FoodCard(
        title = cardTitle,
        description = cardDescription,
        image = cardImage,
        onBuyClick = { /* Acción al hacer clic en el botón Comprar */ }
    )
}


