package com.example.mylogin.screensDashboard

import com.example.mylogin.R

sealed class destinos (
    val icon: Int,
    val title : String,
    val ruta : String
){
    object Pantalla1: destinos(R.drawable.home, "Home", "PantallaHome")
    object Pantalla2: destinos(R.drawable.client, "Datos", "PantallaDatos")
    object Pantalla3: destinos(R.drawable.history, "Historial", "PantallaHistorial")
    object Pantalla4: destinos(R.drawable.map, "Ubicación", "PantallaUbicacion")
    object Pantalla5: destinos(R.drawable.creditcard, "Metodos de Pago", "PantallaMetodoPago")

    object Pantalla6: destinos(R.drawable.imagenproducto, "Carrito","PantallaCarrito")

    object Pantalla7: destinos(R.drawable.creditcard,"Producto","PantallaProducto")

}
