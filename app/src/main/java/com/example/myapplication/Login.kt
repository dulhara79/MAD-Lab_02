package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R.id.loginBttn

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        var loginButton = findViewById<Button>(R.id.loginBttn)
        loginButton.setOnClickListener {
            var intent = Intent(this,dashboard::class.java)
            startActivity(intent)
            finish()
        }

        var signup = findViewById<TextView>(R.id.signup_txt)
        signup.setOnClickListener {
            var intent = Intent(this,SignUp::class.java)
            startActivity(intent)
            finish()
        }
    }
}