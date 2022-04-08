package com.example.myfirstandroidapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuBuilder

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }

    @SuppressLint("RestrictedApi")
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        if (menu is MenuBuilder) {
            menu.setOptionalIconsVisible(true)
        }
        return super.onCreateOptionsMenu(menu)
    }

    // handle button activities
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {

            R.id.dark_light_mode -> {
                Toast.makeText(applicationContext, "click on Activity", Toast.LENGTH_LONG).show()
                return true
            }

            R.id.about_me -> {
                val intent = Intent(this, DisplayAboutMeActivity::class.java).apply {}
                startActivity(intent)
                return true
            }

            R.id.exit -> {
                Toast.makeText(applicationContext, "click on Activity exit", Toast.LENGTH_LONG).show()
                return true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}