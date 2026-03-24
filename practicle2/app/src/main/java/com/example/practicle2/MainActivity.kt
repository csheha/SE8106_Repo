package com.example.practicle2

import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
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
import com.example.practicle2.ui.theme.Practicle2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practicle2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    Hello()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        fontSize = 24.sp

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Practicle2Theme {
        Greeting("Android")
    }
}

@Composable
fun Hello() {
    Text(
        text = "Hello Students",
        modifier = Modifier.background(Color.Yellow)

    )
}

@Composable
@Preview(showBackground = true)
fun HelloPreview() {
    Text(
        text = "Hello Students",
        modifier = Modifier.background(Color.Yellow)
    )
}