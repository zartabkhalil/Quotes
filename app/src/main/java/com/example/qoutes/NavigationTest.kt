package com.example.qoutes

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Preview
@Composable
fun Screen1(navController: NavController) {

    Button(onClick = {
        navController.navigate("Screen2")
    }) {
        Text(text = "Screen 1")
    }
}

@Composable
fun Screen2(navController: NavController) {
    Text(text = "Screen 2")
}

@Preview
@Composable
fun NavApp() {
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Screen1", builder = {
        composable("Screen1"){
            Screen1(navController)
        }
        composable("Screen2"){
            Screen2(navController)
        }
    } )
}