package com.example.two_activity_phonenumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etStartAction_2 = findViewById<EditText>(R.id.etStartAction_2)
        val btnGoActivityTwo = findViewById<Button>(R.id.btnGoActivityTwo)

        btnGoActivityTwo.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("phone", etStartAction_2.text.toString())
            startActivity(intent)
        }

    }

}