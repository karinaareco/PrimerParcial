package com.example.primerparcial.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.primerparcial.Login
import com.example.primerparcial.ui.theme.PrimerParcialTheme

@Composable
fun PantallaLogin(
    modifier: Modifier = Modifier,

    navController: NavController
) {
    var usuario by remember { mutableStateOf("") }
    var contrasena by remember { mutableStateOf("") }


    Column(modifier = modifier) {
        Text(
            text = "Bienvenido a la pagina de logeo, por favor ingrese los datos solicitados:",

            )
        TextField(value = usuario, onValueChange = {
            usuario = it
        })
        Spacer(modifier = modifier.padding(10.dp))
        TextField(value = contrasena, onValueChange = {
            contrasena = it
        })


        Button(


            onClick = {
                if (usuario == "pedro@pe.com.ar" && contrasena == "abc123") {

                    navController.navigate("loginExitoso")
                } else {

                    navController.navigate("loginIncorrecto")
                }
            }) {
            Text(text = "Ingresar")
        }

    }

}



@Preview(showBackground = true)
@Composable
fun PantallaLoginPreview() {
    PrimerParcialTheme {
        val navController = rememberNavController()
        PantallaLogin(navController = navController)
    }
}