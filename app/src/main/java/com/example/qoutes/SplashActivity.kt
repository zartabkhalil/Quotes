package com.example.qoutes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.qoutes.ui.theme.QoutesTheme

@Preview
@Composable
     fun SplashScreen(modifier: Modifier) {
        Box(modifier= Modifier
            .fillMaxSize()
            .background(Color.White),
            contentAlignment = Alignment.Center

        ) {

//            Image(
//                painter = painterResource(id = R.drawable.splashbg),
//                contentDescription ="BackGround for splash",
//                contentScale=ContentScale.FillBounds,
//                modifier=modifier.fillMaxSize()
//                    .padding(0.dp)
//
//                )
            Column(modifier=Modifier.background(Color.Red),
                ) {
            Image(painter = painterResource(id = R.drawable.logo),
                contentDescription ="MainLogo",
            )
            Text(text = "Inspiration and Daily Motivation",
                color=Color.Black,
                fontSize = 16.sp,
                lineHeight = 19.sp
            )

            }
        }
    }
