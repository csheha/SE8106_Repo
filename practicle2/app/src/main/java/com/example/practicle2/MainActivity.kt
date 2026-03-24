package com.example.practicle2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileScreen()
        }
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ProfileTitle()
        ProfileImage()
        ProfileDescription()
    }
}

@Composable
fun ProfileTitle() {
    Text(
        text = "John Doe",
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun ProfileImage() {
    Icon(
        imageVector = Icons.Default.AccountCircle,
        contentDescription = "Profile Image",
        modifier = Modifier
            .padding(16.dp)
            .size(100.dp)
    )
}

@Composable
fun ProfileDescription() {
    Text(
        text = "John Doe is a professional mobile application developer with 5 years of experience in the industry.",
        modifier = Modifier.padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewProfile() {
    ProfileScreen()
}