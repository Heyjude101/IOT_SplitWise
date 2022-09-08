package com.example.splitwiseapp.ui.screen

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun screen3(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(start = 5.dp, end = 5.dp), horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.Top){
        TopTwoImagessss()
        RegisterTextttt()
        Spacer(modifier = Modifier.height(5.dp))
        ExtraRegisterrrr()
        Spacer(modifier = Modifier.height(5.dp))
        OrRegisterTextttt()
        MainRegisterrrr()
        RegisterButtonnnn()
    }
}

@Composable
fun OrRegisterTextttt(){
    Text(text = "Or, Register with..." , color = Color(151 ,157 , 166))
}


@Composable
fun RegisterTextttt(){
    Text(
        text = "Register",
        color = Color(51, 47, 72),
        style = MaterialTheme.typography.h5
    )
    Spacer(modifier = Modifier.height(5.dp))
}
@Composable
fun TopTwoImagessss(){
    Image(painter = painterResource(id = com.example.splitwiseapp.R.drawable.logo), contentDescription = "Big google logo" , modifier = Modifier
        .width(width = 180.dp)
        .height(height = 90.dp))
    Image(painter = painterResource(id = com.example.splitwiseapp.R.drawable.girl), contentDescription = "Big girl image" , modifier = Modifier
        .width(width = 260.dp)
        .height(height = 180.dp))
}

@Composable
fun ExtraRegisterrrr(){
    val context = LocalContext.current
    Row{
        //Google icon
        IconButton(onClick = {
            Toast.makeText(context , "Login Google" , Toast.LENGTH_SHORT).show()
        } , modifier = Modifier.border(width = 1.dp , color = Color(151 ,157 , 166) , shape = RoundedCornerShape(10.dp)).size(40.dp)) {
            Icon(painter = painterResource(id = com.example.splitwiseapp.R.drawable.logosgoogle), contentDescription = "small google logo" , tint = Color.Unspecified ,  modifier = Modifier.size(30.dp))
        }
        Spacer(modifier = Modifier.width(10.dp))
        //FB icon
        IconButton(onClick = {
            Toast.makeText(context , "Login via FB" , Toast.LENGTH_SHORT).show()
        } , modifier = Modifier.border(width = 1.dp , color = Color(151 ,157 , 166) , shape = RoundedCornerShape(10.dp)).size(40.dp)) {
            Icon(painter = painterResource(id = com.example.splitwiseapp.R.drawable.logosfb), contentDescription = "small FB logo" , modifier = Modifier.size(30.dp))
        }
        Spacer(modifier = Modifier.width(10.dp))
        //Apple icon
        IconButton(onClick = {
            Toast.makeText(context , "Login via Apple" , Toast.LENGTH_SHORT).show()
        } , modifier = Modifier.border(width = 1.dp , color = Color(151 ,157 , 166) , shape = RoundedCornerShape(10.dp)).size(40.dp)) {
            Icon(painter = painterResource(id = com.example.splitwiseapp.R.drawable.logosapple), contentDescription = "small apple logo" , tint = Color.Unspecified, modifier = Modifier.size(40.dp))
        }
    }
}

@Composable
fun MainRegisterrrr(){
    Column(){
        EMailTextFieldddd()
        Spacer(modifier = Modifier.height(3.dp))
        PasswordTextFieldddd()
        Spacer(modifier = Modifier.height(3.dp))
        FullNameTextFieldddd()
        Spacer(modifier = Modifier.height(3.dp))
        PhoneNumberFieldddd()
        Spacer(modifier = Modifier.height(5.dp))
    }
}
@Composable
fun PhoneNumberFieldddd(){
    var text by remember { mutableStateOf(TextFieldValue("")) }
    return OutlinedTextField(
        modifier = Modifier.height(60.dp),
        value = text,
        leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "PhoneIcon") },
        onValueChange = {
            text = it
        },
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
        label = { Text(text = "Phone Number") },
        placeholder = { Text(text = "Enter your Phone") },
    )
}




@Composable
fun PasswordTextFieldddd() {

    var password by rememberSaveable { mutableStateOf("") }
    var passwordVisible by rememberSaveable { mutableStateOf(false) }

    return OutlinedTextField(
        modifier = Modifier.height(60.dp),
        value = password,
        leadingIcon = {
            Icon(painter = painterResource(id = com.example.splitwiseapp.R.drawable.lock), contentDescription = "Lock icon")
        },
        onValueChange = { password = it },
        label = { Text("Password") },
        singleLine = true,
        placeholder = { Text("Password") },
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        trailingIcon = {
            val image = if (passwordVisible)
                Icons.Filled.Visibility
            else Icons.Filled.VisibilityOff
            val description = if (passwordVisible) "Hide password" else "Show password"

            IconButton(onClick = {passwordVisible = !passwordVisible}){
                Icon(imageVector  = image, description)
            }
        }
    )
}
@Composable
fun FullNameTextFieldddd() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    return OutlinedTextField(
        modifier = Modifier.height(60.dp),
        value = text,
        leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "faceIcon") },
        onValueChange = {
            text = it
        },
        label = { Text(text = "Full name") },
        placeholder = { Text(text = "Enter your Name") },
    )
}

@Composable
fun EMailTextFieldddd() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    return OutlinedTextField(
        modifier = Modifier.height(60.dp),
        value = text,
        leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon") },
        onValueChange = {
            text = it
        },
        label = { Text(text = "Email ID") },
        placeholder = { Text(text = "Enter your e-mail") },
    )
}


@Composable
fun RegisterButtonnnn() {
    val context = LocalContext.current
    Column(verticalArrangement = Arrangement.Center ,  horizontalAlignment = Alignment.CenterHorizontally , modifier = Modifier
        .padding(10.dp)) {
        Button(onClick = {
            Toast.makeText(context, "Register Clicked!", Toast.LENGTH_SHORT).show()
        },
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color(61,132 , 242),
                contentColor = Color(225, 225, 225)
            ),
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .width(200.dp)
        ) {
            Text(text = "Register" , fontSize = 18.sp)
        }
    }
}