package com.example.qoutes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.qoutes.ui.theme.CustomFonts

@Preview(showBackground = true)
@Composable
fun SplashScreen() {
        Box(modifier= Modifier
            .fillMaxSize()
            .background(Color.White),

        ) {

            Image(
                painter = painterResource(id = R.drawable.splash),
                contentDescription ="BackGround for splash",
                contentScale=ContentScale.FillBounds,
                alignment = Alignment.Center,
                modifier= Modifier
                    .fillMaxSize()
                    .padding(0.dp)


                )
            Column(modifier=Modifier
                .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

                ) {
                Image(painter = painterResource(id = R.drawable.splashlogo),
                    contentDescription ="MainLogo",
                )
                Logo()
                Quotes()
                

            }
        }
    }


@Preview
@Composable
private fun Logo() {
    Column(modifier = Modifier.padding(top=10.dp)) {
        Image(painter = painterResource(id =  R.drawable.logo), contentDescription ="main logo" )
    }
}

@OptIn(ExperimentalTextApi::class)
@Preview
@Composable
private fun Quotes() {
    Row(modifier = Modifier.padding(top=30.dp)) {
        Image(painter = painterResource(id = R.drawable.rightqoute), contentDescription ="Right Qoute" )
        Text(
            text = "Inspiration and Daily Motivation",
            fontSize = 16.sp,
            fontFamily = CustomFonts,
            fontWeight = FontWeight.Normal,
            style= TextStyle(
                    brush = Brush.verticalGradient(
                    colors= listOf(colorResource(id = R.color.color1),colorResource(id = R.color.color2)),
                        startY = 2.9f
                )
             )

        )
        Image(painter = painterResource(id = R.drawable.leftqoute), contentDescription ="Right Qoute" )
    }
}
