package com.example.myfirstandroidapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuBuilder

class DisplayLinearLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_linear_layout)
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

    fun sendName(view: View) {
        val editText = findViewById<EditText>(R.id.editTextName)
        val message = editText.text.toString()
        Toast.makeText(this, "Hello $message!", Toast.LENGTH_SHORT).show()
    }
}