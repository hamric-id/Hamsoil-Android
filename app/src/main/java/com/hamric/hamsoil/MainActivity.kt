package com.hamric.hamsoil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.hamric.hamsoil.ui.theme.HamsoilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HamsoilTheme() {
                // Scaffold provides the basic screen structure (like system bar padding)
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Pass the innerPadding to our screen so it doesn't hide behind the status bar
                }
            }
        }
    }
}