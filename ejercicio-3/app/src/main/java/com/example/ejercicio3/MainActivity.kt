package com.example.ejercicio3

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
import com.example.ejercicio3.ui.theme.Ejercicio3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    fichaEstudiante(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun fichaEstudiante (modifier: Modifier = Modifier) {
    val nombre = "Juan"
    val edad = 24
    val promedio = 7
    val cursaProgramacion = true
    Column(modifier = modifier)
    { Text("Nombre: $nombre")
    Text("Edad: $edad")
    Text("Promedio: $promedio")
        Text("Cursa programacion? $cursaProgramacion")
    Text("Proximo año tendre: ${edad + 1}")}

}

@Preview(showBackground = true)
@Composable
fun fichaEstudiantePreview () {
    Ejercicio3Theme {
        fichaEstudiante()
    }
}

/*
PARTE B)
1)Utilizamos val cuando queremos que el valor no cambie en el futuro(solo lectura no se puede reasignar)
2) Utilizamos var cuando el valor va a cambiar y puede ser reasignado diferente. ejemplo contadores
3) que infiera un tipo significa que cuando asignamos, kotlin mira el valor asignado para ver si sera int,String,double,etc
4) no representan lo mismo porque "20" kotlin infiere que es un string y 20 infiere que es un int

 */
