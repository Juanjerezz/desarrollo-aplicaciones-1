package com.example.ejercicio4

import android.annotation.SuppressLint
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
import com.example.ejercicio4.ui.theme.Ejercicio4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column( modifier = Modifier.padding(innerPadding)) {
                    DatoEstudiante(
                        etiqueta = "Nombre",
                        valor = "juan"
                    )
                    DatoEstudiante(
                        etiqueta= "Carrera",
                        valor = "Ingenieria en informatica"
                    )
                    DatoEstudiante(
                        etiqueta = "Año",
                        valor = "4"
                    )
                        Text(descripcionEdad(
                            edad = 24
                        ))
                } }
            }
        }
    }
}

@Composable
fun DatoEstudiante(etiqueta: String, valor: String){
    Column() {
        Text("$etiqueta: $valor")
    }
}

fun descripcionEdad (edad: Int): String {
    val condicion = if (edad <18) {
        "Menor de edad"
    } else {
        "Mayor de edad"
    }
    return "Edad: $edad años y $condicion"
}

