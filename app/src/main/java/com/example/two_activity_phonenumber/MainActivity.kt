package com.example.two_activity_phonenumber

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    companion object {
        const val SECOND_ACTIVITY_DATA = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGoActivityTwo = findViewById<Button>(R.id.btnGoActivityTwo)

        btnGoActivityTwo.setOnClickListener() {
            startActivityForResult(Intent(this, SecondActivity::class.java),
                SECOND_ACTIVITY_DATA
            )
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


        val etStartAction_2 = findViewById<EditText>(R.id.etStartAction_2)
        when (requestCode) {
            SECOND_ACTIVITY_DATA -> {
                if (resultCode == Activity.RESULT_OK) {
                    Log.d("TAG 1", "${data?.getStringExtra("$etStartAction_2")}")
                    etStartAction_2.setText(data?.getStringExtra("phoneNumber"))
                }
            }
        }
    }
}