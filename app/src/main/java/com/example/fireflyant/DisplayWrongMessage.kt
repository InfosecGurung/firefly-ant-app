package com.example.fireflyant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

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
}