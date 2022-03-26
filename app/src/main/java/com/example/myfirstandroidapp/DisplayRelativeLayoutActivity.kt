package com.example.myfirstandroidapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DisplayRelativeLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_relative_layout)
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

    fun sendFullName(view: View) {
        val editText1 = findViewById<EditText>(R.id.firstNameText)
        val firstName = editText1.text.toString()
        val editText2 = findViewById<EditText>(R.id.lastNameText)
        val lastName = editText2.text.toString()
        Toast.makeText(this, "Hello $firstName $lastName!", Toast.LENGTH_SHORT).show()
    }
}