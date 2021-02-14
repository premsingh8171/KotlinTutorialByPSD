package com.premsinghdaksha.kotlintutorials

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageButton = findViewById<ImageButton>(R.id.imageBtn)
        val num1 = findViewById<EditText>(R.id.Num1)
        val num12 = findViewById<EditText>(R.id.Num2)

        imageButton?.setOnClickListener()
        {
            if (num1.text.toString().isEmpty() || num12.text.toString().isEmpty()) {
                Toast.makeText(this@MainActivity, R.string.pleaseenter, Toast.LENGTH_LONG).show()
            } else {
                val num1 = Integer.parseInt(num1.text.toString())
                val num2 = Integer.parseInt(num12.text.toString())
                Toast.makeText(applicationContext,
                        "Sum of the numbers = " + (num1 + num2),
                        Toast.LENGTH_SHORT).show()
            }
        }
    }
}