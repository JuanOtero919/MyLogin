package com.example.mylogin.screensDashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
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
fun ScreenMetodosPago(){
    Column() {
        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(15.dp))
            Text(text = "Medios de pago", fontSize = 35.sp)
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(15.dp))
            Image(painter = painterResource(id = R.drawable.pago),contentDescription = null)
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(15.dp))
    }
}
}
@Preview
@Composable
fun vistamedios(){
    ScreenMetodosPago()
}