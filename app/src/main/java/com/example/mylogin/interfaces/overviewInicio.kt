package com.example.mylogin.interfaces

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mylogin.R
import com.example.mylogin.navigation.Coffecitoscream
import com.example.mylogin.ui.theme.MyLoginTheme
import com.google.firebase.annotations.concurrent.Background


@Composable
fun MyCustomViewInicio(
    navController: NavController,
   //onNextClick: () -> Unit
) {
    val selectedTab = remember { mutableStateOf(0) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.fondo),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.weight(1f))
            Box(
                modifier = Modifier
                    .size(width = 280.dp, height = 450.dp)
                    .background(Color.White)
            ) {
                when (selectedTab.value) {
                    0 -> {
                        Column(
                            modifier = Modifier.fillMaxSize()
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.background2),
                                contentDescription = "Logo de la App",
                                modifier = Modifier
                                    .padding(0.dp, 30.dp, 0.dp, 0.dp)
                                    .clip(CircleShape)
                                    .size(280.dp)

                            )
                            Text(
                                "Bienvenido a Coffecito",
                                fontSize = 25.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(0.dp, 30.dp, 0.dp, 0.dp)
                            )
                        }
                    }
                    1 -> {
                        
                        Column() {
                            Text(
                                text = "La app de cafetería Cofficito es la solución perfecta para aquellos que aman" +
                                        "disfrutar de una deliciosa taza de café sin tener que salir de casa o la oficina. Al" +
                                        "descargar la aplicación en su dispositivo móvil, los usuarios pueden registrarse" +
                                        "fácilmente y acceder a una amplia variedad de productos de cafetería, incluyendo" +
                                        " cafés, tés, panes, snacks y mucho más.",
                                modifier = Modifier.padding(10.dp)
                            )
                            Text(
                                text = "Una vez que el usuario ha seleccionado los productos que desea comprar, puede" +
                                    "proceder a realizar el pago. Los pedidos se procesan inmediatamente y se envían al" +
                                    "equipo de la cafetería para su preparación. Una vez que el pedido está listo, se" +
                                    "empaqueta cuidadosamente y se envía al usuario a su dirección",
                                modifier = Modifier.padding(10.dp)
                            )

                        }
                    }

                    2 -> {
                        Column {
                            Text(
                                "Equipo de Trabajo",
                                fontSize = 25.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(0.dp, 10.dp, 0.dp, 0.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.equipo),
                                contentDescription = "Imagen de equipo",
                                modifier = Modifier
                                    .padding(0.dp, 10.dp, 0.dp, 0.dp)
                                    .clip(CircleShape)
                                    .size(280.dp)
                            )
                            Text(
                                "Mannuel Fernando Granoble",
                                fontSize = 15.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(0.dp, 10.dp, 0.dp, 0.dp)
                            )
                            Text(
                                "Juan Jose Vasquez Canales",
                                fontSize = 15.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(0.dp, 10.dp, 0.dp, 0.dp)
                            )
                            Text(
                                "Juan Camilo Otero",
                                fontSize = 15.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(0.dp, 10.dp, 0.dp, 0.dp)
                            )
                        }

                    }
                }
            }

            TabRow(
                selectedTabIndex = selectedTab.value,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .height(30.dp)
                    .width(150.dp),
                backgroundColor = Color.Transparent
            ) {
                Tab(
                    selected = selectedTab.value == 0,
                    onClick = { selectedTab.value = 0 },
                    modifier = Modifier
                        .size(10.dp)
                        .padding(PaddingValues(start = 10.dp, end = 10.dp))
                        .background(
                            animateColorAsState(
                                targetValue = if (selectedTab.value == 0) Color(
                                    android.graphics.Color.parseColor(
                                        "#ff3d80f7"
                                    )
                                ) else Color.White.copy(alpha = 0.9f)
                            ).value,
                            shape = CircleShape
                        )
                ) {
                    // Contenido de la pestaña 1
                }
                Tab(
                    selected = selectedTab.value == 1,
                    onClick = { selectedTab.value = 1 },
                    modifier = Modifier
                        .size(10.dp)
                        .padding(PaddingValues(start = 10.dp, end = 10.dp))
                        .background(
                            animateColorAsState(
                                targetValue = if (selectedTab.value == 1) Color(
                                    android.graphics.Color.parseColor(
                                        "#ff3d80f7"
                                    )
                                ) else Color.White.copy(alpha = 0.9f)
                            ).value,
                            shape = CircleShape
                        )
                ) {
                    // Contenido de la pestaña 2
                }
                Tab(
                    selected = selectedTab.value == 2,
                    onClick = { selectedTab.value = 2 },
                    modifier = Modifier
                        .size(10.dp)
                        .padding(PaddingValues(start = 10.dp, end = 10.dp))
                        .background(
                            animateColorAsState(
                                targetValue = if (selectedTab.value == 2) Color(
                                    android.graphics.Color.parseColor(
                                        "#ff3d80f7"
                                    )
                                ) else Color.White.copy(alpha = 0.9f)
                            ).value,
                            shape = CircleShape
                        )
                ) {
                    // Contenido de la pestaña 3
                }

            }
            Spacer(modifier = Modifier.weight(1f))



            Column(
                //verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Button(
                    onClick = { navController.navigate(Coffecitoscream.login.name)},
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .height(50.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color(android.graphics.Color.parseColor("#ff3d80f7")),
                        contentColor = Color.White
                    )
                ) {
                    Text("Siguiente")
                }
            }
        }
    }
}

@Preview
@Composable
fun preview (){
    val navController = rememberNavController()
    MyLoginTheme {
        MyCustomViewInicio(navController )

    }
}

