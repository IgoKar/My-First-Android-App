package com.example.myfirstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.Toast

class DisplayToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_toast)

        val imageViewToast = findViewById<ImageView>(R.id.image_view)
        imageViewToast.setOnClickListener {
            // make a toast on button click event
            Toast.makeText(this, "Hi there! You've clicked imageView Toast!", Toast.LENGTH_SHORT).show()
        }

        val switch = findViewById<Switch>(R.id.switch_long_short)
        val toastBtn = findViewById<Button>(R.id.toast_btn)

        toastBtn.setOnClickListener{
            if(switch.isChecked){
                Toast.makeText(this, "Long toast.", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Short toast", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // R.menu.mymenu is a reference to an xml file named mymenu.xml which should be inside your res/menu directory.
        // If you don't have res/menu, just create a directory named "menu" inside res
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // handle button activities
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.mybutton) {
            val intent = Intent(this, DisplayAboutMeActivity::class.java).apply {}
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}