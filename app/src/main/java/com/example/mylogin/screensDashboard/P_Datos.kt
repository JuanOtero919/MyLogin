package com.example.mylogin.screensDashboard

import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.mylogin.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ScreenDatos(){
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Datos Personales", fontSize = 48.sp)
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(15.dp))
        Text(text = "Juan Diego Perez", color = Color.Black)
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(15.dp))
        Image(painter = painterResource(id = R.drawable.juandiego), contentDescription = null)
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(15.dp))
        Text(text = "Ciudad: Popaýan")
        Text(text = "Edad: 54 años")
        Text(text = "profesión: Ingeniero de sistemas")
        Text(text = "Estado civil: casado")
    }

}
