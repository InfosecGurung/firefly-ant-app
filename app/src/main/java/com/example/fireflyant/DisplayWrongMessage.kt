package com.example.fireflyant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

const val EXTRA_MESSAGE_PLACE = "com.example.fireflyant.MESSAGE"

class DisplayWrongMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_wrong_message)

        /* Get the Intent that started this activity and extract the string */
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val wrong = "hi "
        val fullMessage = " , you don't have access!"
        val textView = findViewById<TextView>(R.id.wrongTextView).apply {
            val welcomeWrongName = wrong + message + fullMessage
            text = welcomeWrongName
        }
    }

    /** Called when the user taps the "First Activity!" button */
    fun goingWhere(view:View) {
        val editText = findViewById<EditText>(R.id.wrongMessageEditText)
        val place = editText.text.toString()

        val placeGoingIntent = Intent(this, MainActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE_PLACE, place)
        }
        startActivity(placeGoingIntent)
    }
}