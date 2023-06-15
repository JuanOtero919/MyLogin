package com.example.mylogin.interfaces

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mylogin.R
import com.example.mylogin.recursos.InfoText
import com.example.mylogin.recursos.ProductText
import com.example.mylogin.recursos.SubtitleText
import com.example.mylogin.screensDashboard.destinos


@Composable
fun ResumenPedidoScreen3(navController: NavHostController) {
    val background: Painter = painterResource(R.drawable.fondo) // Reemplaza "fondo" con el nombre de tu archivo de imagen de fondo

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = background,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent)
                .padding(16.dp)
                .padding(horizontal = 30.dp)
                .align(Alignment.BottomEnd)
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                SubtitleText("TU PEDIDO")
                Spacer(modifier = Modifier.height(25.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                ) {
                    Column(
                        modifier = Modifier
                            .background(Color.White.copy(alpha = 0.8f))
                            .padding(16.dp)
                            //.padding(top = 20.dp)
                            .fillMaxWidth()
                    ) {
                        SubtitleText("Datos de entrega")
                        InfoText("Nombre", "Juan Camilo Otero")
                        InfoText("Dirección", "Cra 6 #20 Norte 26")
                        InfoText("Teléfono", "300-XXX-XXXX")
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                ) {
                    Column(
                        modifier = Modifier
                            .background(Color.White.copy(alpha = 0.8f))
                            .padding(16.dp)
                            //.padding(top = 20.dp)
                            .fillMaxWidth()
                    ) {
                        SubtitleText("Método de pago")
                        MetodoPagoSection()

                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                ) {
                    Column(
                        modifier = Modifier
                            .background(Color.White.copy(alpha = 0.8f))
                            .padding(16.dp)
                            //.padding(top = 20.dp)
                            .fillMaxWidth()
                    ) {
                        SubtitleText("Detalles")
                        ProductText("1x Producto 1")
                        ProductText("3x Producto 2")
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                ) {
                    Column(
                        modifier = Modifier
                            .background(Color.White.copy(alpha = 0.8f))
                            .padding(16.dp)
                            //.padding(top = 20.dp)
                            .fillMaxWidth()
                    ) {
                        SubtitleText("Resumen")
                        InfoText("Costo de productos", "$ 41")
                        InfoText("Costo de envío", "$ 10")
                        InfoText("Costo Total", "$ 51")
                    }
                }
            }

            //val context = LocalContext.current
            Button(
                onClick = { navController.navigate(destinos.Pantalla1.ruta) },
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp)
                    .width(140.dp)
                    .height(48.dp),
                    //.background(Color.Green, RoundedCornerShape(80.dp)),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green),
            ) {
                Text(text = "Realizar pago")
            }
        }
    }
}

@Composable
fun MetodoPagoSection() {
    var selectedOption by remember { mutableStateOf("") }

    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { selectedOption = "Efectivo" }
        ) {
            RadioButton(
                selected = (selectedOption == "Efectivo"),
                onClick = { selectedOption = "Efectivo" }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Efectivo")
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { selectedOption = "PSE" }
        ) {
            RadioButton(
                selected = (selectedOption == "PSE"),
                onClick = { selectedOption = "PSE" }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "PSE")
        }
    }

}
/*
@Preview
@Composable
fun PreviewResumenPedidoScreen3() {
    MaterialTheme {
        ResumenPedidoScreen3()
    }
}*/