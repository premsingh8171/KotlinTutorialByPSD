package com.premsinghdaksha.kotlintutorials

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextLinearLayout = editTextLinearLayout

        //create EditText
        val editText = EditText(this)
        editText.setHint("Enter  something")
        editText.layoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        editText.setPadding(20, 20, 20, 20)

        // Add EditText to LinearLayout
        editTextLinearLayout?.addView(editText)

        val buttonShow = buttonShow;

        buttonShow.setOnClickListener {
            val text = editText.text
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

        }
    }
}