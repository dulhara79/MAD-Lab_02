package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProductDescription : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_product_description)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        var loginButton = findViewById<ImageView>(R.id.back_icon)
        loginButton.setOnClickListener {
            var intent = Intent(this,dashboard::class.java)
            startActivity(intent)
            finish()
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    // Handle Home navigation
                    startActivity(
                        Intent(
                            this@ProductDescription,
                            dashboard::class.java
                        )
                    )
                    true
                }

                R.id.navigation_favorites -> {
                    // Handle Favorites navigation
                    startActivity(
                        Intent(
                            this@ProductDescription,
                            FavouritePage::class.java
                        )
                    )
                    true
                }

                R.id.navigation_cart -> {
                    // Handle Cart navigation
                    startActivity(
                        Intent(
                            this@ProductDescription,
                            Bag::class.java
                        )
                    )
                    true
                }

                R.id.navigation_settings -> {
                    // Handle Settings navigation
                    startActivity(
                        Intent(
                            this@ProductDescription,
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