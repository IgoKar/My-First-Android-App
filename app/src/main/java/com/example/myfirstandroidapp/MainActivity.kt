package com.example.myfirstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editTextName)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    fun getToast(view: View) {
        val intent = Intent(this, DisplayToastActivity::class.java).apply {}
        startActivity(intent)
    }

    fun getLinearLayout(view: View) {
        val intent = Intent(this, DisplayLinearLayoutActivity::class.java).apply {}
        startActivity(intent)
    }

    fun getRelativeLayout(view: View) {
        val intent = Intent(this, DisplayRelativeLayoutActivity::class.java).apply {}
        startActivity(intent)
    }

}