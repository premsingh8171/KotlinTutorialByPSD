package com.premsinghdaksha.kotlintutorials

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkTextView = findViewById<CheckedTextView>(R.id.ctv)
        if (checkTextView != null) {
            checkTextView.isChecked = false
            checkTextView.setCheckMarkDrawable(R.drawable.checked)

            checkTextView.setOnClickListener {
                checkTextView.isChecked = !checkTextView.isChecked
                checkTextView.setCheckMarkDrawable(
                    if (checkTextView.isChecked)
                        android.R.drawable.checkbox_on_background
                    else
                        android.R.drawable.checkbox_off_background
                )

                val msg = getString(R.string.msg_shown) + " " +
                        getString(
                            if (checkTextView.isChecked)
                                R.string.checked else R.string.unchecked
                        )
                Toast.makeText(
                    this@MainActivity, msg,
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

    }
}