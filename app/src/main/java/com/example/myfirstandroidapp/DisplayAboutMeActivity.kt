package com.example.myfirstandroidapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class DisplayAboutMeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me_layout)

        val imageButton = findViewById(R.id.imageButton) as ImageButton
        val imageButton2 = findViewById(R.id.imageButton2) as ImageButton

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
}