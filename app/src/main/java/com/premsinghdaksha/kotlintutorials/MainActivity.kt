package com.premsinghdaksha.kotlintutorials

import android.os.Bundle
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.Num1)
        val num2 = findViewById<EditText>(R.id.Num2)
        val imgBtn = ImageButton(this)

        imgBtn.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 150)
        imgBtn.setImageResource(R.drawable.ic_launcher_background)

        val linearLayout = findViewById<LinearLayout>(R.id.linear_layout)
        // Adding ImageButton in LinearLayout
        linearLayout.addView(imgBtn)

        imgBtn.setOnClickListener {
            if (num1.text.toString().isEmpty() || num2.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Enter both numbers", Toast.LENGTH_SHORT).show()
            }
            else {
                val num1 = Integer.parseInt(num1.text.toString())
                val num2 = Integer.parseInt(num2.text.toString())
                Toast.makeText(applicationContext, "Multiplication of the numbers = " + (num1 * num2), Toast.LENGTH_SHORT).show()
            }
        }
    }
}