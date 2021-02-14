package com.premsinghdaksha.kotlintutorials

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button?.setOnClickListener()
        {
            Toast.makeText(this@MainActivity, R.string.message, Toast.LENGTH_LONG).show()
        }
    }
}