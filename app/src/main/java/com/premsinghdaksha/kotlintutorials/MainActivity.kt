package com.premsinghdaksha.kotlintutorials

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById(R.id.text_view_id) as TextView

        textView?.setOnClickListener {
            Toast.makeText(this@MainActivity, "COMPUTER SCIENCE PORTAL", Toast.LENGTH_LONG).show()
        }
    }
}