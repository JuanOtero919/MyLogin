package com.example.mylogin.viewmodel


import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ViewProductoViewModel : ViewModel() {
    private val _quantity = MutableStateFlow(1)
    val quantity: StateFlow<Int> get() = _quantity.asStateFlow()

    fun incrementQuantity() {
        _quantity.value += 1
    }

    fun decrementQuantity() {
        if (_quantity.value > 1) {
            _quantity.value -= 1
        }
    }

    fun agregarProducto() {
        // Acciones para agregar el producto
    }
}
