package com.example.mylogin.recursos


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mylogin.R

@Composable
fun FacebookLoginButton(onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xFF3B5998), // Color de fondo de Facebook
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(24.dp) // Forma redondeada del botón
    ) {
        Row(
            modifier = Modifier.padding(start = 16.dp, end = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.facebook), // Logo de Facebook
                contentDescription = null,
                modifier = Modifier.size(24.dp)
                //tint = Color.White
            )
            Text(
                text = "Iniciar sesión con Facebook", // Texto del botón
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }
}
@Preview
@Composable
fun previewBoton() {
    FacebookLoginButton {

    }
}