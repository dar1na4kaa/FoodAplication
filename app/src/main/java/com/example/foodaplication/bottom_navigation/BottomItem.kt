package com.example.foodaplication.bottom_navigation

import com.example.foodaplication.R


sealed class BottomItem(val title: String, val iconId: Int, val route:String) {
    object Screen1: BottomItem("Screen 1", R.drawable.home_icon, "screen_1")
    object Screen2: BottomItem("Screen 2", R.drawable.search_icon, "screen_2")
    object Screen3: BottomItem("Screen 3", R.drawable.like_icon, "screen_3")
    object Screen4: BottomItem("Screen 4", R.drawable.profile_icon, "screen_4")
}
