package com.example.two_activity_phonenumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvStartAction_2 = findViewById<TextView>(R.id.tvStartAction_2)

        tvStartAction_2.setOnClickListener{
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}