package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStart = findViewById<Button>(R.id.getStartbutton)
        getStart.setOnClickListener {
            val intent = Intent(this, OnboardScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}
