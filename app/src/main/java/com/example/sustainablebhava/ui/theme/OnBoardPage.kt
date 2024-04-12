package com.example.sustainablebhava.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sustainablebhava.R


@Composable
fun OnBoardInPage(navController: NavController) {
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
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(R.drawable.sb_logo_1), contentDescription ="logo", modifier = Modifier
                .fillMaxWidth()
                .height(170.dp) )
            Image(painter = painterResource(R.drawable.bro), contentDescription ="logo1",modifier = Modifier
                .fillMaxWidth()
                .height(240.dp) )
            Image(painter = painterResource(R.drawable.group_2), contentDescription ="" , modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(4.dp))

            Button(onClick = { navController.navigate("loginPage") }, modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)) {
                Text(text = "Get Started")
                
            }
            Text(text = "Our Partners", color = Color.White)
            Row {
                Image(painter = painterResource(R.drawable.pluclogo1), contentDescription = "pluc1", modifier = Modifier
                    .size(100.dp)
                    .padding(6.dp))
                Image(painter = painterResource(R.drawable.pluclogo2), contentDescription = "pluc2",modifier = Modifier
                    .size(100.dp)
                    .padding(6.dp))
                Image(painter = painterResource(R.drawable.earthday), contentDescription = "eartday",modifier = Modifier
                    .size(100.dp)
                    .padding(6.dp))
                Image(painter = painterResource(R.drawable.global_peace_foundation), contentDescription = "foundation",modifier = Modifier
                    .size(100.dp)
                    .padding(6.dp))

            }
            Image(painter = painterResource(R.drawable.group_1), contentDescription = "group1", modifier = Modifier
                .fillMaxWidth()
                .height(120.dp))

        }

    }
}

@Preview
@Composable
fun OnBoardPagePreview(){
    SustainableBhavaTheme {
        OnBoardInPage(navController = rememberNavController())
    }
}