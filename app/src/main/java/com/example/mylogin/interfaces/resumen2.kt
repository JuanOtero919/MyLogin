package com.example.mylogin.interfaces

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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
import com.example.mylogin.R
import com.example.mylogin.recursos.InfoText
import com.example.mylogin.recursos.ProductText
import com.example.mylogin.recursos.SubtitleText

@Composable
fun ResumenPedidoScreen2() {
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

        Column(
            modifier = Modifier
                //.fillMaxSize()
                .background(Color.Transparent)
                .padding(40.dp),

        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(30.dp))
            ) {
                Column(
                    modifier = Modifier
                        .padding(bottom = 32.dp)
                        .fillMaxWidth()

                        .background(Color.White.copy(alpha = 0.8f))
                        .padding(16.dp)

                ) {
                    SubtitleText("Datos de entrega")
                    InfoText("Nombre", "Nombre del cliente")
                    InfoText("Dirección", "Dirección de entrega")
                    InfoText("Teléfono", "Número de teléfono")
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(30.dp))
            ) {
                Column(
                    modifier = Modifier
                        .padding(bottom = 32.dp)
                        .fillMaxWidth()
                        .background(Color.White.copy(alpha = 0.8f))
                        .padding(16.dp)

                ) {
                    SubtitleText("Método de pago")
                    InfoText("Efectivo", "Pago en efectivo")
                    InfoText("PSE", "Pago con PSE")
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(30.dp))
            ) {
                Column(
                    modifier = Modifier
                        .padding(bottom = 32.dp)
                        .fillMaxWidth()
                        .background(Color.White.copy(alpha = 0.8f))
                        .padding(16.dp)

                ) {
                    SubtitleText("Detalles")
                    ProductText("1x Producto 1")
                    ProductText("3x Producto 2")
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(30.dp))
            ) {
                Column(
                    modifier = Modifier
                        .padding(bottom = 32.dp)
                        .fillMaxWidth()
                        .background(Color.White.copy(alpha = 0.8f))
                        .padding(16.dp)

                ) {
                    SubtitleText("Resumen")
                    InfoText("Costo de productos", "$ 41")
                    InfoText("Costo de envío", "$ 10")
                }
            }
            val context = LocalContext.current

        }
        Button(
            onClick = { /* Acción al hacer clic */ },
            modifier = Modifier
                //.align(Alignment.End)
                .padding(bottom = 32.dp, end = 32.dp)
                .width(140.dp)
                .height(48.dp)
                .background(Color.Green)
                .align(Alignment.BottomEnd),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green),
            shape = RoundedCornerShape(40.dp)
        ) {
            Text(text = "Realizar pago")
        }
    }
}


@Preview
@Composable
fun PreviewResumenPedidoScreen2() {
    MaterialTheme {
        ResumenPedidoScreen2()
    }
}
