package com.example.primerparcial.pages

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.primerparcial.ui.theme.PrimerParcialTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainPage(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Inicio") },
                colors =  topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary

                )
            )
        }
    ) {
        NavHost(modifier = modifier.padding(it),
            navController = navController,
            startDestination = "pantallaLogin"){

            composable("pantallaLogin") { PantallaLogin(navController = navController) }
            composable("loginExitoso") { LoginExitoso(navController = navController) }
            composable("loginIncorrecto") { LoginIncorrecto(navController = navController) }

        }


    }


}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    PrimerParcialTheme {
        MainPage()
    }
}