package com.example.ejercicio5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejercicio5.ui.theme.Ejercicio5Theme
import androidx.compose.foundation.background
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio5Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        Text("Cronograma materias", style = MaterialTheme.typography.headlineSmall,modifier = Modifier.align(Alignment.CenterHorizontally))
                        Row(modifier = Modifier.background(color = Color.Yellow).fillMaxWidth().padding(10.dp)){
                            Text("Nombre de la materia ")
                            Text("Año de cursada")
                        }
                        Row(modifier = Modifier.padding(10.dp).fillMaxWidth().background(color = Color.Yellow)){
                            Text("Ingenieria de datos 1 ")
                            Text("2 año")
                        }
                        Text(materia("Ingenieria de datos 1",2))
                        Text(materia("Ingenieria de datos 2",3))
                        Button(onClick = {},modifier = Modifier.align(Alignment.CenterHorizontally))
                        {Text("Ver más") }
                    }
                }
            }
        }
    }
}

fun materia(nombre : String,anio: Int): String{
    return "Materia: $nombre y año de cursada $anio"

}

/*
* importante: el modificador que ponés primero en la cadena decide el tamaño "grande" de la caja. Los que vienen después trabajan puertas adentro de esa caja ya establecida.
*  */