package com.example.myfirstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class DisplayToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_toast)

        val imageViewToast = findViewById(R.id.image_view) as ImageView
        imageViewToast.setOnClickListener {
            // make a toast on button click event
            Toast.makeText(this, "Hi there! You've clicked imageView Toaster!", Toast.LENGTH_SHORT).show()
        }

        val shortToast = findViewById(R.id.short_toast) as Button
        shortToast.setOnClickListener {
            // make a toast on button click event
            Toast.makeText(this, "Hi there! This toast displays shorter.", Toast.LENGTH_SHORT).show()
        }

        val longToast = findViewById(R.id.long_toast) as Button
        longToast.setOnClickListener {
            // make a toast on button click event
            Toast.makeText(this, "Hi there! This Toast displays longer.", Toast.LENGTH_LONG).show()
        }
    }
}