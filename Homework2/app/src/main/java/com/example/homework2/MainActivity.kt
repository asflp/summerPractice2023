package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val controller = (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment)
            .navController

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bnv_main)
        bottomNavigationView.setupWithNavController(controller)

        val idMap = mapOf(R.id.profileFragment to "Profile Fragment",
            R.id.newsFragment to "News Fragment", R.id.musicFragment to "Music Fragment",
            R.id.messageFragment to "Message Fragment", R.id.settingsFragment to "Settings Fragment")

        bottomNavigationView.setOnItemSelectedListener { item ->

            val currentDestination = controller.currentDestination

            if(currentDestination?.id != item.itemId) {
                controller.navigate(item.itemId)
                Snackbar.make(findViewById(R.id.container), "${idMap[currentDestination?.id]}",
                    Snackbar.LENGTH_SHORT).setAnchorView(bottomNavigationView).show()
                true
            }
            else false
        }
    }
}