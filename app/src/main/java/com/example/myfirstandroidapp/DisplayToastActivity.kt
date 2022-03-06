package com.example.myfirstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.Toast

class DisplayToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_toast)

        val imageViewToast = findViewById(R.id.image_view) as ImageView
        imageViewToast.setOnClickListener {
            // make a toast on button click event
            Toast.makeText(this, "Hi there! You've clicked imageView Toast!", Toast.LENGTH_SHORT).show()
        }

        val switch = findViewById(R.id.switch_long_short) as Switch
        val toastBtn = findViewById(R.id.toast_btn) as Button

        toastBtn.setOnClickListener{
            if(switch.isChecked){
                Toast.makeText(this, "Long toast.", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Short toast", Toast.LENGTH_SHORT).show()
            }
        }
    }
}