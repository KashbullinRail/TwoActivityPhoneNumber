package com.example.two_activity_phonenumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etEnteredPhoneNumber = findViewById<EditText>(R.id.etEnteredPhoneNumber)
        val btnGoActivityTwo = findViewById<Button>(R.id.btnGoActivityTwo)

        etEnteredPhoneNumber.setOnClickListener {
            etEnteredPhoneNumber.setText("")
        }

        btnGoActivityTwo.setOnClickListener {
            val r = Regex("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}\$")
            if (r.matches(etEnteredPhoneNumber.text.toString())) {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("phoneNumber", etEnteredPhoneNumber.text.toString())
                startActivity(intent)
            } else Toast
                .makeText(applicationContext, "номер набран не верно", Toast.LENGTH_LONG)
                .show()
        }
    }
}