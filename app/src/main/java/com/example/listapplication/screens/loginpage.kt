package com.example.listapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)

@Composable
fun PreviewFun() {
    Login()
}

@Composable
fun Login() {
    val emailState = remember {
        mutableStateOf("")
    }
    val passwordState = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // App Title
        Text(
            text = "SpeedyServe",
            fontSize = 50.sp,
            color = Color.Red,
            fontWeight = FontWeight.ExtraBold,
            letterSpacing = 3.sp,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 50.dp)
        )
Column(horizontalAlignment = Alignment.CenterHorizontally,) {
    Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(0.dp, 25.dp)) {
        Text(text = "Enter Email : ", style = MaterialTheme.typography.bodyLarge, modifier = Modifier.padding(0.dp, 0.dp,0.dp,10.dp))

        // Email TextField
        TextField(value = emailState.value, onValueChange = {
                newVal -> emailState.value = newVal
        },
//            modifier = Modifier.background(Color.Red),
            label = { Text(text = "Email")},
            shape = RoundedCornerShape(8.dp),

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
    }

    Column (horizontalAlignment = Alignment.Start, modifier = Modifier.padding(0.dp, 25.dp)){
        Text(text = "Enter Password : ", style = MaterialTheme.typography.bodyLarge, modifier = Modifier.padding(0.dp, 0.dp,0.dp,10.dp))

        // Password TextField
        TextField(value = passwordState.value, onValueChange = {
                newPass -> passwordState.value = newPass
        },
            label = { Text(text = "Password")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        )
    }
    // Password Label


    // Login Button
    Button(
        onClick = { /* Handle login logic */ },
        modifier = Modifier
            .width(170.dp)
            .padding(top = 16.dp)
    ) {
        Text(text = "Login", fontWeight = FontWeight.Bold, letterSpacing = 2.sp, fontSize = 20.sp)
    }
}
        // Email Label

    }
}
