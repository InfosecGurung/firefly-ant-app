package com.example.fireflyant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

const val EXTRA_MESSAGE = "com.example.fireflyant.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val placeTextBox = intent.getStringExtra(EXTRA_MESSAGE_PLACE)

        val textView = findViewById<TextView>(R.id.mainActivityPlaceAnswer).apply {
            text = placeTextBox
        }
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()

        // check if the user enters "ants" or "ANTS" or "Ants" in the text box
        if (message == "ants" || message == "Ants" || message == "ANTS") {
            val intent = Intent(this, DisplayMessageActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }
            startActivity(intent)
        } else {
            val wrongIntent = Intent(this, DisplayWrongMessage::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }
            startActivity(wrongIntent)
        }
    }

}
