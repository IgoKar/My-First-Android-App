package com.example.myfirstandroidapp


import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*


const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alertDialogBtn = findViewById<Button>(R.id.alert_dialog_button)
        alertDialogBtn.setOnClickListener{
            val viewColor: ColorDrawable = root_layout.getBackground() as ColorDrawable
            val colorId = viewColor.color

            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setTitle("App background color")
            builder.setMessage("Do you want to set the app background?")
            builder.setPositiveButton("YES"){ _, _ ->
                if(colorId != Color.GRAY) {
                    Toast.makeText(applicationContext,"Background color changed to gray!", Toast.LENGTH_SHORT).show()
                    root_layout.setBackgroundColor(Color.GRAY)
                }
                else {
                    Toast.makeText(applicationContext,"Default background color restored!", Toast.LENGTH_SHORT).show()
                    root_layout.setBackgroundColor(Color.TRANSPARENT)
                }
            }
            builder.setNegativeButton("NO"){ _, _ ->
                Toast.makeText(applicationContext, "Background change cancelled...", Toast.LENGTH_SHORT).show()
            }
            val dialog:AlertDialog = builder.create()
            dialog.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
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