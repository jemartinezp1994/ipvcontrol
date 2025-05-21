package com.example.inventario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.inventario.ui.theme.InventarioAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InventarioAppTheme {
                Greeting("Inventario")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hola $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InventarioAppTheme {
        Greeting("Android")
    }
}
