package com.example.sustainablebhava.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sustainablebhava.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController){
    LaunchedEffect(key1 = true) {
        delay(2500)
        navController.navigate("onBoard")
        
    }
    Box(contentAlignment = Alignment.Center,modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.pexels_akil_mazumder_1072824_1),
            contentDescription = "splashImg",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Image(painter = painterResource(R.drawable.sb_logo_1), contentDescription ="" , modifier = Modifier.fillMaxSize())

    }
}

@Preview
@Composable
fun PreviewSplashScreen(){
    SustainableBhavaTheme {
        SplashScreen(navController = rememberNavController())
    }
}