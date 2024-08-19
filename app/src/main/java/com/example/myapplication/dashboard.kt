package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        var getStart = findViewById<ImageView>(R.id.best_img_3)
        getStart.setOnClickListener {
            var intent = Intent(this,ProductDescription::class.java)
            startActivity(intent)
            finish()
        }

        getStart = findViewById<ImageView>(R.id.coco_oil)
        getStart.setOnClickListener {
            var intent = Intent(this,ProductDescription::class.java)
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
                            this@dashboard,
                            dashboard::class.java
                        )
                    )
                    true
                }

                R.id.navigation_favorites -> {
                    // Handle Favorites navigation
                    startActivity(
                        Intent(
                            this@dashboard,
                            FavouritePage::class.java
                        )
                    )
                    true
                }

                R.id.navigation_cart -> {
                    // Handle Cart navigation
                    startActivity(
                        Intent(
                            this@dashboard,
                            Bag::class.java
                        )
                    )
                    true
                }

                R.id.navigation_settings -> {
                    // Handle Settings navigation
                    startActivity(
                        Intent(
                            this@dashboard,
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