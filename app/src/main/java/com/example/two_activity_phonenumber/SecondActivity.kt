package com.example.two_activity_phonenumber

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity(R.layout.activity_second) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val etPutPhoneNumber = findViewById<TextView>(R.id.etPutPhoneNumber)
        val btnGoPhoneCall = findViewById<Button>(R.id.btnGoPhoneCall)
        val phone = intent.getStringExtra("phoneNumber").toString()

        etPutPhoneNumber.setText(phone)

        btnGoPhoneCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel: + ${etPutPhoneNumber.text.toString()}")
            startActivity(intent)
        }
    }
}