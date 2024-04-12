package com.example.sustainablebhava.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sustainablebhava.R

@Composable
fun LogInPage(){
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    val color1 = Color(0xFF92E3B1) // #92E3B1
    val color2 = Color(0xFF00689D)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(color1, color2)
                )
            )

    ){
        Column {


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 30.dp), // Add padding here for the text alignment
                contentAlignment = Alignment.CenterStart
            ) {
                Column {
                    Image(painter = painterResource(R.drawable.hi_what_a_beautiful_day), contentDescription = "hi what", modifier = Modifier
                        .width(290.dp)
                        .height(29.dp))
                    Spacer(modifier = Modifier.height(4.dp))
                    Image(painter = painterResource(R.drawable.welcome_to_sustainable_world), contentDescription ="sustainable", modifier = Modifier
                        .width(237.dp)
                        .height(110.dp))

                }


            }
            LoginSignupButton()



        }




    }
}
@Composable
fun LoginSignupButton() {
    var loginButtonClicked by remember { mutableStateOf(false) }
    var registerButtonClicked by remember { mutableStateOf(false) }

    val color1 = Color(0xFF92E3B1) // #92E3B1
    val color2 = Color(0xFF458381)
    Column {



    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, top = 52.dp, end = 30.dp)
            .background(
                color = Color.Transparent,
                shape = RoundedCornerShape(20.dp)
            ) // Set the background color of the Row to transparent
    ) {
        Button(
            onClick = {
                loginButtonClicked = true
                registerButtonClicked = false
            },
            modifier = Modifier
                .weight(1f)
                .height(50.dp)
                .background(
                    if (loginButtonClicked) color2 else color1,
                    shape = RoundedCornerShape(20.dp)
                ) // Change button background color based on state
        ) {
            Text(
                text = "Login",
                color = if (loginButtonClicked) color1 else Color.White
            ) // Change text color based on state
        }



        Button(
            onClick = {
                registerButtonClicked = true
                loginButtonClicked = false
            },
            modifier = Modifier
                .weight(1f)
                .height(50.dp)
                .background(
                    if (registerButtonClicked) color2 else color1,
                    shape = RoundedCornerShape(20.dp)
                ) // Change button background color based on state
        ) {
            Text(
                text = "Register",
                color = if (registerButtonClicked) color1 else Color.White
            ) // Change text color based on state
        }
    }
        if (loginButtonClicked) {
            LoginInfoCard()
        }else{
        RegisterInfoCard()
        }
}
}

@Composable
fun LoginInfoCard(){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .shadow(elevation = 2.dp),
         // No elevation
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(Color.Transparent)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(330.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                label = { Text("Email") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                label = { Text("Password") },
                visualTransformation = PasswordVisualTransformation(),
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Forgot Password?")
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { /* Handle login */ },
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(text = "Login")
            }
        }
    }
}
@Composable
fun RegisterInfoCard(){
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var number by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .shadow(elevation = 2.dp),
        // No elevation
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(Color.Transparent)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(426.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextField(
                value = name,
                onValueChange = { name = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                label = { Text("enter your name") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                label = { Text("enter your email") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = number,
                onValueChange = { number = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                label = { Text("enter your number") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                label = { Text("enter your password") },
                visualTransformation = PasswordVisualTransformation(),
            )
            Spacer(modifier = Modifier.height(8.dp))
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { /* Handle login */ },
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(text = "Create")
            }
        }
    }
}


@Preview
@Composable
fun LogInPagePreview(){
    SustainableBhavaTheme {
        LogInPage()
    }
}