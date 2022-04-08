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

class DisplayRelativeLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_relative_layout)
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

    fun sendFullName(view: View) {
        val editText1 = findViewById<EditText>(R.id.firstNameText)
        val firstName = editText1.text.toString()
        val editText2 = findViewById<EditText>(R.id.lastNameText)
        val lastName = editText2.text.toString()
        Toast.makeText(this, "Hello $firstName $lastName!", Toast.LENGTH_SHORT).show()
    }
}