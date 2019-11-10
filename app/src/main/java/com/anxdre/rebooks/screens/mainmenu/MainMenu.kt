package com.anxdre.rebooks.screens.mainmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.anxdre.rebooks.R
import kotlinx.android.synthetic.main.activity_main_menu.*
import kotlinx.android.synthetic.main.fragment_main_menu.*

class MainMenu : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        navController = Navigation.findNavController(this,R.id.fragment_main)

        bottom_nav_main_menu.setupWithNavController(navController)

        NavigationUI.setupActionBarWithNavController(this,navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        bottom_nav_main_menu.visibility = View.VISIBLE
        return NavigationUI.navigateUp(navController, null)
    }
}
