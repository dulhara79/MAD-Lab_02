package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class FavouritePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_favourite_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    // Handle Home navigation
                    startActivity(
                        Intent(
                            this@FavouritePage,
                            dashboard::class.java
                        )
                    )
                    true
                }

                R.id.navigation_favorites -> {
                    // Handle Favorites navigation
                    startActivity(
                        Intent(
                            this@FavouritePage,
                            FavouritePage::class.java
                        )
                    )
                    true
                }

                R.id.navigation_cart -> {
                    // Handle Cart navigation
                    startActivity(
                        Intent(
                            this@FavouritePage,
                            Bag::class.java
                        )
                    )
                    true
                }

                R.id.navigation_settings -> {
                    // Handle Settings navigation
                    startActivity(
                        Intent(
                            this@FavouritePage,
                            Settings::class.java
                        )
                    )
                    true
                }

                else -> false
            }
        }
    }
}