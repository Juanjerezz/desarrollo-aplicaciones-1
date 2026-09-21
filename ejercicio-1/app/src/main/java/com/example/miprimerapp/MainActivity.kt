package com.example.miprimerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.miprimerapp.ui.theme.MiPrimerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiPrimerAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Juan",
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
        text = "Hola Android - $name",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiPrimerAppTheme {
        Greeting("Juan")
    }
}


/*
PREGUNTAS EJERCICIO 1
¿Qué archivo contiene el código Kotlin principal? : el archivo kotlin principal es MainActivity.kt
¿Qué diferencia observás entre hacer Run y abrir solamente un Preview? al hacer run ejecuta el emulador con el AVD, mientras que al hacer preview, solo carga el composable de forma estatica
¿Qué es un AVD? ¿Es lo mismo que el emulador? un AVD Android virtual device contiene toda la configuracion (hardware, pantalla,version) de un android, mientras que el emulador lo ejecuta
¿Qué API de Android utiliza el dispositivo virtual creado? utiliza la version de android 37.1
¿Qué ocurre si el AVD está apagado cuando se presiona Run? cuando se presiona run, android studio detecta que no hay ningun AVD y lo arranca automaticamente antes de instalar y ejecutar.

*  */