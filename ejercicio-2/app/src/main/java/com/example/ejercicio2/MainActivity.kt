package com.example.ejercicio2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejercicio2.ui.theme.Ejercicio2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Presentacion(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejercicio2Theme {
        Greeting("Android")
    }
}



@Composable
fun Presentacion(modifier: Modifier = Modifier) {
    Column(modifier= modifier ) {
        Text(text = "Juan")
    Text(text = "Ingenieria en informatica")
    Text(text = "Quiero aprender jetpack compose")}
}

@Preview(showBackground = true)
@Composable
fun PresentacionPreview() {
    Ejercicio2Theme {
        Presentacion(
        )
    }
}

/*
* Eliminando @composable tira error de que no se pueden usar sin que sea una funcion composable
* modificando Text no reconoce la referencia y no deja ejecutar la preview
* */