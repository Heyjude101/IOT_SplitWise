package com.example.splitwiseapp.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun screen1(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(start = 5.dp, end = 5.dp), horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.Top){
        Text("Screen 1 goes here. Please make it here. Contains: One button to move to login and one to move to Signup")
        Button(
            onClick = {
//            Toast.makeText(context, "Lets go", Toast.LENGTH_SHORT).show()
                navController.navigate("screen2")
            },
            contentPadding = PaddingValues(8.dp),
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color(243, 67, 28),
                contentColor = Color(225, 225, 225)
            ),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.padding(20.dp)
        )
        {
            Text(
                "Go to screen 2 (Login)"
            )
            Icon(
                Icons.Filled.ArrowForward,
                contentDescription = "Go to login",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )

        }
    }
}