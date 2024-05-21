package com.example.qoutes

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val title: String,
    val route: String,
    val selectedIcon: Painter,
    val unselectedIcon: ImageVector,
//    val hasnew: Boolean,
//    val badges: Int

)

