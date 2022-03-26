package com.example.myfirstandroidapp


import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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