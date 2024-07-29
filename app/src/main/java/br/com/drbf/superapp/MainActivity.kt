package br.com.drbf.superapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import br.com.drbf.superapp.ui.MainNavGraph
import br.com.drbf.design.ui.theme.SuperappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SuperappTheme {
                val navController = rememberNavController()
                MainNavGraph(navController = navController)
            }
        }
    }
}


