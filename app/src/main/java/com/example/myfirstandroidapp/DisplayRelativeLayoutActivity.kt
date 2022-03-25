package com.example.myfirstandroidapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DisplayRelativeLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_relative_layout)
    }

    fun sendFullName(view: View) {
        val editText1 = findViewById<EditText>(R.id.firstNameText)
        val firstName = editText1.text.toString()
        val editText2 = findViewById<EditText>(R.id.lastNameText)
        val lastName = editText2.text.toString()
        Toast.makeText(this, "Hello $firstName $lastName!", Toast.LENGTH_SHORT).show()
    }
}