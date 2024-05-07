package com.example.primerparcial.pages

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.primerparcial.ui.theme.PrimerParcialTheme

@Composable
fun LoginExitoso(modifier: Modifier = Modifier,
                 navController: NavController
) {
    Text(
        text = "Se logeo exitosamente",

    )
}

@Preview(showBackground = true)
@Composable
fun LoginExitosoPreview() {
    PrimerParcialTheme {
        val navController = rememberNavController()
        LoginExitoso( navController = navController)
    }
}