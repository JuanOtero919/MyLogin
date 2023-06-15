package com.example.mylogin.screensDashboard

import androidx.activity.ComponentActivity
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mylogin.R


@Composable
fun ScreenHistorial(){
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Historial de Compras", fontSize = 40.sp)
        Text(text= "por semana", fontSize = 18.sp)
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(15.dp))
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(15.dp))
        Text(text = "1."+" Pastel de Pollo"+"         "+"4 unidades"+"         "+"$18000")
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(15.dp))
        Text(text = "2."+" Pastel de Yuca "+"         "+"3 unidades"+"         "+"$15000")
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(15.dp))
        Text(text = "3."+" Jugo de Mora  "+"         "+"2 unidades"+"         "+"$10000")
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(15.dp))
        Text(text = "4."+" Cerveza Poker "+"         "+"5 unidades"+"         "+"$30000")
    }
}

@Preview
@Composable
fun vistaHistorial(){
    ScreenHistorial()
}

