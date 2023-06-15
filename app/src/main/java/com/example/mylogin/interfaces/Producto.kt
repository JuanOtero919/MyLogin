package com.example.mylogin.interfaces


import com.example.mylogin.R

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mylogin.recursos.InfoText
import com.example.mylogin.recursos.ProductText
import com.example.mylogin.recursos.SubtitleText
import com.example.mylogin.viewmodel.ViewProductoViewModel
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue


@Composable
fun ViewProducto( viewProductViewModel: ViewProductoViewModel = viewModel()) {
    val quantity by viewProductViewModel.quantity.collectAsState()
    //val (quantity, setQuantity) = remember { mutableStateOf(1) }
    val background: Painter = painterResource(R.drawable.fondo)
    val loremIpsumText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = background,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = androidx.compose.ui.layout.ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height((LocalConfiguration.current.screenHeightDp / 2).dp)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp)
                )
                .align(Alignment.BottomCenter),
            contentAlignment = Alignment.Center
        ) {
            Column(modifier = Modifier.padding(horizontal = 40.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.imagenproducto),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)

                )
                Spacer(modifier = Modifier.height(16.dp))
                SubtitleText("Nombre del Producto")
                Spacer(modifier = Modifier.height(8.dp))
                Text(loremIpsumText)
                Text(loremIpsumText)
                Spacer(modifier = Modifier.height(16.dp))
                Text("$ 4.500", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(20.dp))



                Row(modifier = Modifier
                    .fillMaxWidth()
                    //.background(Color.LightGray),
                    //horizontalArrangement = Arrangement.SpaceBetween

                ) {
                    IconButton(
                        onClick = { viewProductViewModel.decrementQuantity() },

                        modifier = Modifier.padding(end = 10.dp)
                    ) {
                        Icon(Icons.Default.KeyboardArrowLeft, contentDescription = "Minus")
                    }

                    Text(text = quantity.toString(), modifier = Modifier.align(
                        Alignment.CenterVertically
                    ))

                    IconButton(
                        onClick = { viewProductViewModel.incrementQuantity() },

                        modifier = Modifier.padding(start = 10.dp)
                    ) {
                        Icon(Icons.Default.KeyboardArrowRight, contentDescription = "Plus")
                    }

                    Spacer(modifier = Modifier.weight(1f))

                    Button(
                        onClick = { /* Acción al hacer clic en el botón Agregar */ },
                        modifier = Modifier.padding(end = 5.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Text(text = "Agregar")
                    }
                }
            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun ViewProductoPreview() {
    val viewModel = remember { ViewProductoViewModel() }
    ViewProducto(viewProductViewModel = viewModel)
}

