package com.example.splitwiseapp.ui.screen

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
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
fun screen2(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(start = 5.dp, end = 5.dp), horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.Top){
        TopTwoImages()
        MainLogin()
        LoginButton()
        ExtraLogin()
    }
}

@Composable
fun TopTwoImages(){
    Image(painter = painterResource(id = com.example.splitwiseapp.R.drawable.logo), contentDescription = "Big google logo" , modifier = Modifier
        .width(width = 240.dp)
        .height(height = 120.dp))
    Image(painter = painterResource(id = com.example.splitwiseapp.R.drawable.girl), contentDescription = "Big girl image" , modifier = Modifier
        .width(width = 320.dp)
        .height(height = 270.dp))
}

@Composable
fun MainLogin(){
    Column(){
        Text(
            text = "Login",
            color = Color(51, 47, 72),
            style = MaterialTheme.typography.h5
        )
        Spacer(modifier = Modifier.height(5.dp))
        EMailTextField()
        Spacer(modifier = Modifier.height(5.dp))
        PasswordTextField()
        Spacer(modifier = Modifier.height(5.dp))

    }
}

@Composable
fun EMailTextField() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    return OutlinedTextField(
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
fun PasswordTextField() {

    var password by rememberSaveable { mutableStateOf("") }
    var passwordVisible by rememberSaveable { mutableStateOf(false) }

    return OutlinedTextField(
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
fun LoginButton() {
    val context = LocalContext.current
    var toastobj: Toast;
    toastobj = Toast.makeText(context , "heleoeo" , Toast.LENGTH_SHORT)
    Column(verticalArrangement = Arrangement.Center ,  horizontalAlignment = Alignment.CenterHorizontally , modifier = Modifier
        .padding(10.dp)) {
        Button(onClick = {
            toastobj.cancel()
            toastobj = Toast.makeText(context, "Login Clicked!", Toast.LENGTH_SHORT)
            toastobj.show()
        },
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color(250 ,187 , 4),
                contentColor = Color(225, 225, 225)
            ),
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier.align(Alignment.CenterHorizontally).width(200.dp)
        ) {
            Text(text = "Login" , fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Or, Login with..." , color = Color(151 ,157 , 166))
        Spacer(modifier = Modifier.height(5.dp))
    }
}

@Composable
fun ExtraLogin() {
    val context = LocalContext.current
    var toastobj: Toast;
    toastobj = Toast.makeText(context , "heleoeo" , Toast.LENGTH_SHORT)
    Row {
        //Google icon
        IconButton(onClick = {
            toastobj.cancel()
            toastobj = Toast.makeText(context, "Login Google", Toast.LENGTH_SHORT)
            toastobj.show()
        },
            modifier = Modifier.border(
                width = 1.dp,
                color = Color(151, 157, 166),
                shape = RoundedCornerShape(10.dp)
            )) {
            Icon(
                painter = painterResource(id = com.example.splitwiseapp.R.drawable.logosgoogle),
                contentDescription = "small google logo"
            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        //FB icon
        IconButton(onClick = {
            toastobj.cancel()
            toastobj = Toast.makeText(context, "Login via FB", Toast.LENGTH_SHORT)
            toastobj.show()
        },
            modifier = Modifier.border(
                width = 1.dp,
                color = Color(151, 157, 166),
                shape = RoundedCornerShape(10.dp)
            )) {
            Icon(
                painter = painterResource(id = com.example.splitwiseapp.R.drawable.logosfb),
                contentDescription = "small FB logo"
            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        //Apple icon
        IconButton(onClick = {
            toastobj.cancel()
            toastobj = Toast.makeText(context, "Login via Apple", Toast.LENGTH_SHORT)
            toastobj.show()
        },
            modifier = Modifier.border(
                width = 1.dp,
                color = Color(151, 157, 166),
                shape = RoundedCornerShape(10.dp)
            )) {
            Icon(
                painter = painterResource(id = com.example.splitwiseapp.R.drawable.logosapple),
                contentDescription = "small apple logo"
            )
        }
    }
}
