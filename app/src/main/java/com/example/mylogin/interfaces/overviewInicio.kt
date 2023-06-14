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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.mylogin.R


@Composable
fun MyCustomViewInicio(

   onNextClick: () -> Unit
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
                        Text("Contenido de la pestaña 1")
                    }
                    1 -> {
                        Text("Contenido de la pestaña 2")
                    }
                    2 -> {
                        Text("Contenido de la pestaña 3")
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
                    onClick = {},
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



