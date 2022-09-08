package com.example.splitwiseapp.ui.screen

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun screen5(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(start = 5.dp, end = 5.dp), horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.Center) {
        Details()
        TransactionHistory()
        AmountTextField()
        Spacer(modifier = Modifier.height(10.dp))
        PayButton()
        MessageButton()
    }
}

@Composable
fun Details(){
    Image(painter = painterResource(id = com.example.splitwiseapp.R.drawable.profile), contentDescription = "Profile Image" , modifier = Modifier
        .size(60.dp)
        .clip(CircleShape))
    Spacer(modifier = Modifier.height(8.dp))
    Text("Ritik Raj" , color = Color.Black , style = MaterialTheme.typography.h5)
    Spacer(modifier = Modifier.height(8.dp))
    Text("+91 6206099448" , color = Color(104, 104, 104))
}

@Composable
fun TransactionHistory(){
    //to be edited once we get the api for data
    Spacer(modifier = Modifier.height(14.dp))
    Text("Transaction history goes here." , color = Color(140, 146, 155))
    Spacer(modifier = Modifier.height(14.dp))
}

@Composable
fun AmountTextField(){
    var text by remember { mutableStateOf(TextFieldValue("")) }
    return OutlinedTextField(
        modifier = Modifier
            .width(130.dp)
            .height(60.dp),
        shape = RoundedCornerShape(20.dp),
        value = text,
        leadingIcon = { Icon(painter = painterResource(id = com.example.splitwiseapp.R.drawable.rupee), contentDescription = "PhoneIcon") },
        onValueChange = {
            text = it
        },
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
        label = { Text(text = "Amount" , color = Color(68, 68, 69)) },
        placeholder = { Text(text = "Amount") },
    )
}

@Composable
fun PayButton(){
    val context = LocalContext.current
    Column(verticalArrangement = Arrangement.Center ,  horizontalAlignment = Alignment.CenterHorizontally , modifier = Modifier
        .padding(10.dp)) {
        Button(onClick = {
            Toast.makeText(context, "Pay Clicked!", Toast.LENGTH_SHORT).show()
        },
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color(42, 178, 76),
                contentColor = Color(225, 225, 225)
            ),
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .width(100.dp)
        ) {
            Text(text = "Pay" , fontSize = 18.sp)
        }
    }
}

@Composable
fun MessageButton(){
    var text by remember { mutableStateOf(TextFieldValue("")) }
    return OutlinedTextField(
        modifier = Modifier.height(60.dp),
        shape = RoundedCornerShape(30.dp),
        value = text,
        onValueChange = {
            text = it
        },
        label = { Text(text = "Message") }
    )

}