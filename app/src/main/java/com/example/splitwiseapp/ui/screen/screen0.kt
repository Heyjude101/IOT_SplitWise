package com.example.splitwiseapp.ui.screen

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun screen0(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        ImagePart()
        TextPart()
        ButtonPart(navController)
    }
}

@Composable
fun ImagePart(){
    Image(painter = painterResource(id = com.example.splitwiseapp.R.drawable.img_1), contentDescription = "Gpay image here" ,
        modifier = Modifier
            .size(300.dp)
            .background(Color(45 , 45 , 45), shape = RoundedCornerShape(30.dp))
    )
}

@Composable
fun TextPart() {
    Column {
        Text(
            "Discover Fastest Transactions",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(vertical = 0.dp , horizontal = 10.dp),
            textAlign = TextAlign.Center,
            color = Color(51,47,72)
        )
        Text(
            "Explore all the way new paying on your daily routine",
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(10.dp),
            textAlign = TextAlign.Center,
            color = Color(125,125,143)
        )
    }
}

@Composable
fun ButtonPart(navController: NavController) {
    val context = LocalContext.current
    Button(
        onClick = {
//            Toast.makeText(context, "Lets go", Toast.LENGTH_SHORT).show()
                  navController.navigate("screen1")
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
            "Let's go!"
        )
        Icon(
            Icons.Filled.ArrowForward,
            contentDescription = "Lets go",
            modifier = Modifier.size(ButtonDefaults.IconSize)
        )

    }
}