package com.example.primerparcial.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.primerparcial.ui.theme.PrimerParcialTheme

@Composable
fun PantallaLogin(modifier: Modifier = Modifier) {
    Column (modifier = modifier) {
        Text(
            text = "Bienvenido a la pagina de logeo, por favor ingrese los datos solicitados:",

        )
        TextField(value = "", onValueChange = {})

    }

}

@Preview(showBackground = true)
@Composable
fun PantallaLoginPreview() {
    PrimerParcialTheme {
        PantallaLogin()
    }
}