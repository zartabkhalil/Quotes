package com.example.qoutes

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.CoroutineScope

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Drawer() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    var navController = rememberNavController()
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(drawerState = drawerState, drawerContent = {
        ModalDrawerSheet {
            Text(text = "Dummy conent")
            Divider()
            NavigationDrawerItem(label = { Text(text = "item") },
                selected = false,
                onClick = { /*TODO*/ })
        }
    }) {
        Scaffold(bottomBar = { BottomBar(navController = navController) }


        ) {

            BottomNavGraph(navController, scope, drawerState)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNavGraph(
    navController: NavHostController,
    scope: CoroutineScope,
    drawerState: DrawerState,
) {


    NavHost(navController = navController, startDestination = "HomeScreen") {
        composable("HomeScreen") {
            HomeScreen(navController, scope, drawerState)
        }
        composable("CategoryScreen") {
            CategoryScreen()
        }
        composable("FavScreen") {
            FavScreen()
        }
        composable("AddScreen") {
            AddScren()
        }
        composable("MyWorkScreen") {
            MyWorkScreen()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun BottomBar(navController: NavHostController) {
    val items = listOf(
        BottomNavItem(
            title = "Home",
            route = "HomeScreen",
            selectedIcon = painterResource(id = R.drawable.home_icon),
            unselectedIcon = Icons.Outlined.Home,

            ),
        BottomNavItem(
            title = "Category",
            route = "CategoryScreen",
            selectedIcon = painterResource(id = R.drawable.cat_icon),
            unselectedIcon = Icons.Outlined.LocationOn,

            ),
        BottomNavItem(
            title = "Add",
            route = "AddScreen",
            selectedIcon = painterResource(id = R.drawable.plus),
            unselectedIcon = Icons.Outlined.LocationOn,
        ),
        BottomNavItem(
            title = "Favourite",
            route = "FavScreen",
            selectedIcon = painterResource(id = R.drawable.heart),
            unselectedIcon = Icons.Outlined.LocationOn,
        ),
        BottomNavItem(
            title = "MyWork",
            route = "MyWorkScreen",
            selectedIcon = painterResource(id = R.drawable.folder),
            unselectedIcon = Icons.Outlined.LocationOn,
        )
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    var selectedOn by rememberSaveable {
        mutableStateOf(0)
    }
//    NavigationBar {
//        items.forEachIndexed { index, item ->
//            NavigationBarItem(selected = index == selectedOn, onClick = {
//                selectedOn = index
//                navController.navigate(item.route){
//                    popUpTo(0)
//                }
//            }, icon = {
//                BadgedBox(badge = {}) {
//                    Icon(imageVector = Icons.Outlined.Home, contentDescription = "")
//                }
//            })
//
//        }
//    }
        BottomAppBar(
            cutoutShape=fabShape

        ) {
            items.forEachIndexed { index, item ->
            NavigationBarItem(selected = index == selectedOn, onClick = {
                selectedOn = index
                navController.navigate(item.route){
                    popUpTo(0)
                }
            }, icon = {
                BadgedBox(badge = {}) {
                    Icon(imageVector = Icons.Outlined.Home, contentDescription = "")
                }
            })

        }
        }
//    Box(
//        modifier = Modifier.padding(10.dp, end = 10.dp, bottom = 5.dp)
//
//    ) {
//        Row(
//            modifier = Modifier
//                .border(2.dp, colorResource(id = R.color.border), RoundedCornerShape(19.dp))
//                .fillMaxWidth()
//                .height(78.dp)
//                .clip(RoundedCornerShape(19.dp))
//                .background(
//                    Brush.verticalGradient(
//                        colors = listOf(
//                            colorResource(id = R.color.color1),
//                            colorResource(id = R.color.color2)
//                        ),
//                        startY = 1.1f
//                    )
//                ),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceAround
//
//        ) {
//
//
//            items.forEachIndexed { index, item ->
//
//                if (item.title === "Add") {
//                    Column(
//                        modifier = Modifier.
//                        clip(RoundedCornerShape(40.dp)).
//                        padding(bottom = 40.dp).
//                        background(Brush.linearGradient(colors = listOf(colorResource(id = R.color.color2),
//                            colorResource(id = R.color.color2))))
//                            .size(80.dp),
//
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.Center
//                    ) {
//                        Image(
//                            painter = item.selectedIcon,
//                            contentDescription = "bars",
//                            modifier = Modifier
//                                .height(20.dp)
//                                .width(20.dp)
//                        )
//                        Text(
//                            text = item.title,
//                            color = Color.White,
//                            fontSize = 12.sp
//                        )
//                    }
//
//                } else
//                    Column(
//                        modifier = Modifier.padding(
//
//                        ),
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Image(
//                            painter = item.selectedIcon,
//                            contentDescription = "bars",
//                            modifier = Modifier
//                                .height(20.dp)
//                                .width(20.dp)
//                        )
//                        Text(
//                            text = item.title,
//                            color = Color.White,
//                            fontSize = 12.sp
//                        )
//                    }
//            }
//        }
//    }
}


