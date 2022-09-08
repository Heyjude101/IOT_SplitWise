package com.example.splitwiseapp.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.splitwiseapp.R

@Composable
fun screen4(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(start = 5.dp, end = 5.dp), horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.Top){
        TopTwoImagess()
        RegisterText()
        Spacer(modifier = Modifier.height(5.dp))
        ExtraRegister()
        Spacer(modifier = Modifier.height(5.dp))
        OrRegisterText()
        MainRegister()
        RegisterButton()
    }
}

@Composable
fun OrRegisterText(){
    androidx.compose.material.Text(
        text = "Or, Register with...",
        color = androidx.compose.ui.graphics.Color(151, 157, 166)
    )
}


@Composable
fun RegisterText(){
    androidx.compose.material.Text(
        text = "Register",
        color = androidx.compose.ui.graphics.Color(51, 47, 72),
        style = androidx.compose.material.MaterialTheme.typography.h5
    )
    Spacer(modifier = Modifier.height(5.dp))
}
@Composable
fun TopTwoImagess(){
    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "Big google logo",
        modifier = Modifier
            .width(width = 180.dp)
            .height(height = 90.dp)
    )
    Image(
        painter = painterResource(id = R.drawable.girl),
        contentDescription = "Big girl image",
        modifier = Modifier
            .width(width = 260.dp)
            .height(height = 180.dp)
    )
}

@Composable
fun ExtraRegister(){
    val context = androidx.compose.ui.platform.LocalContext.current
    Row{
        //Google icon
        androidx.compose.material.IconButton(onClick = {
            android.widget.Toast.makeText(
                context,
                "Login Google",
                android.widget.Toast.LENGTH_SHORT
            ).show()
        },
            modifier = Modifier.border(
                width = 1.dp,
                color = androidx.compose.ui.graphics.Color(151, 157, 166),
                shape = androidx.compose.foundation.shape.RoundedCornerShape(10.dp)
            ).size(40.dp)) {
            androidx.compose.material.Icon(
                painter = androidx.compose.ui.res.painterResource(id = R.drawable.logosgoogle),
                contentDescription = "small google logo",
                tint = androidx.compose.ui.graphics.Color.Unspecified,
                modifier = Modifier.size(30.dp)
            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        //FB icon
        androidx.compose.material.IconButton(onClick = {
            android.widget.Toast.makeText(
                context,
                "Login via FB",
                android.widget.Toast.LENGTH_SHORT
            ).show()
        },
            modifier = Modifier.border(
                width = 1.dp,
                color = androidx.compose.ui.graphics.Color(151, 157, 166),
                shape = androidx.compose.foundation.shape.RoundedCornerShape(10.dp)
            ).size(40.dp)) {
            androidx.compose.material.Icon(
                painter = androidx.compose.ui.res.painterResource(id = R.drawable.logosfb),
                contentDescription = "small FB logo",
                modifier = Modifier.size(30.dp)
            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        //Apple icon
        androidx.compose.material.IconButton(onClick = {
            android.widget.Toast.makeText(
                context,
                "Login via Apple",
                android.widget.Toast.LENGTH_SHORT
            ).show()
        },
            modifier = Modifier.border(
                width = 1.dp,
                color = androidx.compose.ui.graphics.Color(151, 157, 166),
                shape = androidx.compose.foundation.shape.RoundedCornerShape(10.dp)
            ).size(40.dp)) {
            androidx.compose.material.Icon(
                painter = androidx.compose.ui.res.painterResource(id = R.drawable.logosapple),
                contentDescription = "small apple logo",
                tint = androidx.compose.ui.graphics.Color.Unspecified,
                modifier = Modifier.size(40.dp)
            )
        }
    }
}

@Composable
fun MainRegister(){
    Column(){
        EMailTextFieldd()
        Spacer(modifier = Modifier.height(3.dp))
        PasswordTextFieldd()
        Spacer(modifier = Modifier.height(3.dp))
        FullNameTextField()
        Spacer(modifier = Modifier.height(3.dp))
        PhoneNumberField()
        Spacer(modifier = Modifier.height(5.dp))
    }
}
@Composable
fun PhoneNumberField(){
    var text by androidx.compose.runtime.remember {
        androidx.compose.runtime.mutableStateOf(
            androidx.compose.ui.text.input.TextFieldValue(
                ""
            )
        )
    }
    return androidx.compose.material.OutlinedTextField(
        modifier = Modifier.height(60.dp),
        value = text,
        leadingIcon = {
            androidx.compose.material.Icon(
                imageVector = androidx.compose.material.icons.Icons.Default.Phone,
                contentDescription = "PhoneIcon"
            )
        },
        onValueChange = {
            text = it
        },
        keyboardOptions = androidx.compose.foundation.text.KeyboardOptions.Default.copy(keyboardType = androidx.compose.ui.text.input.KeyboardType.Number),
        label = { androidx.compose.material.Text(text = "Phone Number") },
        placeholder = { androidx.compose.material.Text(text = "Enter your Phone") },
    )
}




@Composable
fun PasswordTextFieldd() {

    var password by androidx.compose.runtime.saveable.rememberSaveable {
        androidx.compose.runtime.mutableStateOf(
            ""
        )
    }
    var passwordVisible by androidx.compose.runtime.saveable.rememberSaveable {
        androidx.compose.runtime.mutableStateOf(
            false
        )
    }

    return androidx.compose.material.OutlinedTextField(
        modifier = Modifier.height(60.dp),
        value = password,
        leadingIcon = {
            androidx.compose.material.Icon(
                painter = androidx.compose.ui.res.painterResource(id = R.drawable.lock),
                contentDescription = "Lock icon"
            )
        },
        onValueChange = { password = it },
        label = { androidx.compose.material.Text("Password") },
        singleLine = true,
        placeholder = { androidx.compose.material.Text("Password") },
        visualTransformation = if (passwordVisible) androidx.compose.ui.text.input.VisualTransformation.None else androidx.compose.ui.text.input.PasswordVisualTransformation(),
        keyboardOptions = androidx.compose.foundation.text.KeyboardOptions(keyboardType = androidx.compose.ui.text.input.KeyboardType.Password),
        trailingIcon = {
            val image = if (passwordVisible)
                androidx.compose.material.icons.Icons.Filled.Visibility
            else androidx.compose.material.icons.Icons.Filled.VisibilityOff
            val description = if (passwordVisible) "Hide password" else "Show password"

            androidx.compose.material.IconButton(onClick = { passwordVisible = !passwordVisible }) {
                androidx.compose.material.Icon(imageVector = image, description)
            }
        }
    )
}
@Composable
fun FullNameTextField() {
    var text by androidx.compose.runtime.remember {
        androidx.compose.runtime.mutableStateOf(
            androidx.compose.ui.text.input.TextFieldValue(
                ""
            )
        )
    }
    return androidx.compose.material.OutlinedTextField(
        modifier = Modifier.height(60.dp),
        value = text,
        leadingIcon = {
            androidx.compose.material.Icon(
                imageVector = androidx.compose.material.icons.Icons.Default.Face,
                contentDescription = "faceIcon"
            )
        },
        onValueChange = {
            text = it
        },
        label = { androidx.compose.material.Text(text = "Full name") },
        placeholder = { androidx.compose.material.Text(text = "Enter your Name") },
    )
}

@Composable
fun EMailTextFieldd() {
    var text by androidx.compose.runtime.remember {
        androidx.compose.runtime.mutableStateOf(
            androidx.compose.ui.text.input.TextFieldValue(
                ""
            )
        )
    }
    return androidx.compose.material.OutlinedTextField(
        modifier = Modifier.height(60.dp),
        value = text,
        leadingIcon = {
            androidx.compose.material.Icon(
                imageVector = androidx.compose.material.icons.Icons.Default.Email,
                contentDescription = "emailIcon"
            )
        },
        onValueChange = {
            text = it
        },
        label = { androidx.compose.material.Text(text = "Email ID") },
        placeholder = { androidx.compose.material.Text(text = "Enter your e-mail") },
    )
}


@Composable
fun RegisterButton() {
    val context = androidx.compose.ui.platform.LocalContext.current
    Column(verticalArrangement = Arrangement.Center ,  horizontalAlignment = Alignment.CenterHorizontally , modifier = Modifier
        .padding(10.dp)) {
        androidx.compose.material.Button(
            onClick = {
                android.widget.Toast.makeText(
                    context,
                    "Register Clicked!",
                    android.widget.Toast.LENGTH_SHORT
                ).show()
            },
            colors = androidx.compose.material.ButtonDefaults.textButtonColors(
                backgroundColor = androidx.compose.ui.graphics.Color(61, 132, 242),
                contentColor = androidx.compose.ui.graphics.Color(225, 225, 225)
            ),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(30.dp),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .width(200.dp)
        ) {
            androidx.compose.material.Text(text = "Register", fontSize = 18.sp)
        }
    }
}