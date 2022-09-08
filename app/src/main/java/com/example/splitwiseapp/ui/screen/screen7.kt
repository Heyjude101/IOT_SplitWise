package com.example.splitwiseapp.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun screen7(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(start = 5.dp, end = 5.dp), horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.SpaceAround) {
        TopImg()
        TextParty()
        BottomImg()
    }
}
@Composable
fun TopImg() {
    Image(painter = painterResource(id = com.example.splitwiseapp.R.drawable.topimg), contentDescription = "Top image", modifier = Modifier
        .height(273.dp)
        .width(483.dp))
}

@Composable
fun TextParty() {
    Text(text = "Transaction Successful" , style = MaterialTheme.typography.h4)
}

@Composable
fun BottomImg() {
    Image(painter = painterResource(id = com.example.splitwiseapp.R.drawable.imgx), contentDescription = "Bottom image", modifier = Modifier
        .height(70.dp)
        .width(70.dp))
}