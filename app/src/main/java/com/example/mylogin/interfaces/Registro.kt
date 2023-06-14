package com.example.mylogin.interfaces

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusOrder
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mylogin.R
import com.example.mylogin.recursos.FacebookLoginButton
import com.example.mylogin.recursos.InputType
import com.example.mylogin.recursos.TextInput
import com.example.mylogin.ui.theme.Shapes


@Composable
fun registro(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.fondo),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )


        val passwordFocusRequester = FocusRequester()
        val focusManager = LocalFocusManager.current

        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            )
        {
            WordText("Completa")
            WordText("tu")
            WordText("Registro")
        }

        Column(
            Modifier
                .navigationBarsPadding()
                .padding(24.dp)
                .fillMaxSize(),

            verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.Bottom),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {




            TextInput(InputType.Name,
                keyboardActions = KeyboardActions(
                    onNext = {
                        passwordFocusRequester.requestFocus()
                    }
                )
            )
            TextInput(InputType.Password,
                keyboardActions = KeyboardActions(
                    onDone = {
                        focusManager.clearFocus()
                    }
                ),
                focusRequester = passwordFocusRequester
            )
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color(android.graphics.Color.parseColor("#ff3d80f7")),
                    contentColor = Color.White
                )
            ) {
                Text("REGISTER NOW", Modifier.padding(vertical = 8.dp))
            }

            Text("or use")

            FacebookLoginButton(onClick = {})

        }
    }
}


@Composable
fun WordText(word: String) {
    Text(
        text = word,
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        ),
        color = Color.Black
    )
}
