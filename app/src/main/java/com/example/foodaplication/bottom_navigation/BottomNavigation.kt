package com.example.foodaplication.bottom_navigation

import androidx.compose.foundation.background
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState


@Composable
fun BottomNavigation(
    navController: NavController
) {
    val listItems = listOf(
        BottomItem.Screen1,
        BottomItem.Screen2,
        BottomItem.Screen3,
        BottomItem.Screen4
    )
    NavigationBar(
        modifier = Modifier
            .background(Color.White)
    ) {
        val backStateEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStateEntry?.destination?.route
        listItems.forEach { item ->
            NavigationBarItem(
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route)
                },
                icon = {
                    Icon(painter = painterResource(id = item.iconId), contentDescription = "item")
                },
                label = {
                    Text(text = item.title, fontSize = 9.sp)
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Blue,
                    unselectedIconColor = Color.Gray,
                    selectedTextColor = Color.Blue,
                    unselectedTextColor = Color.Gray
                )
            )
        }
    }
}