package com.example.myfirstandroidapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuBuilder


class DisplayAboutMeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me_layout)

        val imageButton = findViewById<ImageButton>(R.id.imageButton)
        val imageButton2 = findViewById<ImageButton>(R.id.imageButton2)

        imageButton.setOnClickListener{
            val launchBrowser = Intent(Intent.ACTION_VIEW)
            launchBrowser.data = Uri.parse("https://www.github.com/IgoKar/")
            launchBrowser.addCategory(Intent.CATEGORY_BROWSABLE)
            startActivity(launchBrowser)
        }

        imageButton2.setOnClickListener{
            val launchBrowser = Intent(Intent.ACTION_VIEW)
            launchBrowser.data = Uri.parse("https://www.linkedin.com/in/igor-karlik-5b54bb206/")
            launchBrowser.addCategory(Intent.CATEGORY_BROWSABLE)
            startActivity(launchBrowser)
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