package com.example.two_activity_phonenumber

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(R.layout.activity_second) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val etPutPhoneNumber = findViewById<EditText>(R.id.etPutPhoneNumber)
        var phone = "1111111"

        phone = intent.getStringExtra("phone").toString()

        etPutPhoneNumber.setText(phone)

    }
}