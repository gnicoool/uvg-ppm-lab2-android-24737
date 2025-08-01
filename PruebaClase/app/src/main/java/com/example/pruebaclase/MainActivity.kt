/*Jackelyn Nicolle Girón Villacinda
Carné: 24737
Programacion de plataformas moviles
* */
package com.example.pruebaclase

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pruebaclase.ui.theme.PruebaClaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PruebaClaseTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    GreetingText("Laboratorio 2 moviles bienvenido", autor = "Jackelyn Girón")
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, autor: String, modifier: Modifier = Modifier){
    val context = LocalContext.current
    Column (verticalArrangement = Arrangement.Center ,
        modifier = modifier.padding(8.dp)){
        Text(text = message, fontSize = 50.sp, lineHeight = 60.sp, textAlign = TextAlign.Center)
        Text(text = autor, fontSize = 30.sp, textAlign = TextAlign.Left)
        Button(onClick = { Toast.makeText(context, "Plataformas moviles, holaa ", Toast.LENGTH_SHORT).show()}) {
            Text("Botón")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun CartaPreview() {
    PruebaClaseTheme {
        GreetingText("Lab 2 moviles bienvenido", autor = "Jackelyn Girón")
    }
}