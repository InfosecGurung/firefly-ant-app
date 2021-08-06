package com.example.fireflyant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TravelDestination : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel_destination)

        val destination = intent.getStringExtra(EXTRA_MESSAGE_PLACE)

        val textView = findViewById<TextView>(R.id.textFromWrongActivity).apply {
            text = destination
        }

    }
}