package com.example.qoutes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun HomeScreen(navController: NavHostController, scope: CoroutineScope, drawerState: DrawerState) {
        Row(modifier = Modifier.padding(top = 20.dp, start = 20.dp)) {


                Spacer(
                        modifier = Modifier
                                .background(Color.Red)
                                .width(10.dp)
                )
                Image(painter = painterResource(id = R.drawable.bars),
                        contentDescription = "",
                        modifier = Modifier
                                .width(16.dp)
                                .height(10.dp)
                                .clickable {
                                        scope.launch {
                                                drawerState.apply {
                                                        if (isClosed) open() else close()
                                                }
                                        }
                                })
        }
}