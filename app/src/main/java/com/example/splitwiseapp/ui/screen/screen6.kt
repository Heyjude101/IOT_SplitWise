package com.example.splitwiseapp.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun screen6(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(start = 5.dp, end = 5.dp), horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.Center) {
        Detailsssss()
    }
}

@Composable
fun Detailsssss() {
    Text(text = "Split screen here");
}
