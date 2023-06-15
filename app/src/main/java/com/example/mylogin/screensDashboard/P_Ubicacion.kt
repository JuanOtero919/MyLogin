package com.example.mylogin.screensDashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mylogin.R

@Composable
fun ScreenUbicacion(){

    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(15.dp))
        Text(text = "Cofficito", fontSize = 35.sp)
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(15.dp))
        Image(painter = painterResource(id = R.drawable.mapaunicauca),contentDescription = null)
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(15.dp))
        Text(text = "La mejor cafeteria de Popayán, se encuentra ubicada " +
                "cerca a la Universidad del Cauca, justo al lado de la Facultad de Ingenieria Civil." +"" +
                "Ven a deleitarte con todos nuestros productos")
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(15.dp))
        Text(text = "Te esperamos...")


    }
}


@Preview
@Composable
fun vistaUbicacion(){
    ScreenUbicacion()
}