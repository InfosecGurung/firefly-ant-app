package com.example.fireflyant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayWrongMessage : AppCompatActivity() {
    private val wrong = "YOU ARE NOT ANTS"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_wrong_message)

        /* Get the Intent that started this activity and extract the string */
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.wrongTextView).apply {
            text = wrong
        }
    }
}