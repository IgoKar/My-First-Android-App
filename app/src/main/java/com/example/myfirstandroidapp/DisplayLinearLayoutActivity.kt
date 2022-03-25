package com.example.myfirstandroidapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DisplayLinearLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_linear_layout)
    }

    fun sendName(view: View) {
        val editText = findViewById<EditText>(R.id.editTextName)
        val message = editText.text.toString()
        Toast.makeText(this, "Hello $message!", Toast.LENGTH_SHORT).show()
    }
}