package com.example.qoutes


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.qoutes.ui.theme.CustomFonts

@Preview(showBackground = true)
@Composable
fun Permission() {
    Box(modifier= Modifier
        .fillMaxSize()
        .background(Color.White),

        ) {

        Image(
            painter = painterResource(id = R.drawable.permissionbg),
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
            Card(
                modifier = Modifier
                    .height(206.dp)
                    .width(300.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Black.copy(alpha = 0.1f)
                ),
                border= BorderStroke(1.dp,Color.White)
//                color = Color.Black.copy(alpha = 0.6f),
            ) {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(start = 10.dp, top = 10.dp, end = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Please Read our Terms of Services ",
                        fontSize = 14.sp,
                        color=Color.White
                        )
                    Text(text = "&",
                        fontSize = 24.sp,
                        color=Color.White,
                        textAlign = TextAlign.Center)
                    Text(text = "Privacy Polices before using this app",
                        fontSize = 14.sp,
                        color=Color.White)

                }
                Row(Modifier.padding(start = 10.dp, end = 10.dp, bottom = 10.dp)) {
                    Button(modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp),
                        onClick = { /*TODO*/ }) {
                            Text(text = "Allow",
                        fontSize = 15.sp,
                                fontFamily = CustomFonts,
                                fontWeight = FontWeight.Bold,
                        color=Color.White,
                        textAlign = TextAlign.Center)
                    }
                }
            }

        }
    }
}


