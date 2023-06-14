package com.example.mylogin.interfaces

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.mylogin.R
import com.example.mylogin.screensDashboard.NavigationHostPrincipal
import com.example.mylogin.screensDashboard.destinos
//import com.example.dashboard.ui.theme.DashboardTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun PantallaDashboard(){
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val navigationItems = listOf(
        destinos.Pantalla1,
        destinos.Pantalla2,
        destinos.Pantalla3,
        destinos.Pantalla4,
        destinos.Pantalla5

    )
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {TopBar(scope, scaffoldState)},
        drawerContent = { Drawer(
            scope,
            scaffoldState,
            navController,
            navigationItems)
        }
    ){
        it
        NavigationHostPrincipal(navController = navController)
    }

}


@Composable
fun TopBar(
    scope:CoroutineScope,
    scaffoldState: ScaffoldState
){
    TopAppBar(
        title = {Text(text = "Cofficito")},
        navigationIcon = {
            IconButton(onClick = { scope.launch { scaffoldState.drawerState.open() }}) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = null)
            }
        }
    )
}

@Composable
fun Drawer(
    scope: CoroutineScope,
    scaffoldState: ScaffoldState,
    navController: NavHostController,
    menu_item: List<destinos>){

    Column {
        Image(
            painter = painterResource(id = R.drawable.background2),
            contentDescription = null,
            modifier = Modifier
                .height(160.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(15.dp))

        val currentRoute = currentRoute(navController)
        menu_item.forEach{ item ->
            DrawerItem(item = item, selected = currentRoute == item.ruta){
                navController.navigate(item.ruta){
                    launchSingleTop =true
                }
                scope.launch {
                    scaffoldState.drawerState.close()
                }
            }
        }
    }
}

@Composable
fun DrawerItem(item : destinos, selected : Boolean, onItemClick: (destinos)->Unit){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .padding(6.dp)
            .clip(RoundedCornerShape(12))
            .background( if(selected) MaterialTheme.colors.primaryVariant.copy(alpha = 0.25f) else Color.Transparent)
            .padding(12.dp)
            .clickable { onItemClick(item) },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(painterResource(id = item.icon)  , contentDescription = item.title)
        Spacer(modifier = Modifier.width(12.dp))
        Text(text = item.title,
            style = MaterialTheme.typography.body1,
            color = if(selected) MaterialTheme.colors.secondaryVariant else MaterialTheme.colors.onBackground)

    }
}

@Composable
fun currentRoute(navController: NavHostController): String?{
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewDashboard() {
    PantallaDashboard()
}