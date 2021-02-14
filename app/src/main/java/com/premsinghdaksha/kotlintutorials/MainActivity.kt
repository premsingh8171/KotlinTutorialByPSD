package com.premsinghdaksha.kotlintutorials

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val linearLayout = container;

        val radioButton1 = RadioButton(this)
        radioButton1.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        radioButton1.setText("Black")
        radioButton1.id = 1

        val radioButton2 = RadioButton(this)
        radioButton2.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        radioButton2.setText("White")
        radioButton2.id = 2

        val radioButton3 = RadioButton(this)
        radioButton3.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT)
        radioButton3.setText("Blue")
        radioButton3.id = 3

        val radioButton4 = RadioButton(this)
        radioButton4.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        radioButton4.setText("Green")
        radioButton4.id = 3

        val radioGroup = radioGroup
        if (radioGroup != null) {
            radioGroup.addView(radioButton1)
            radioGroup.addView(radioButton2)
            radioGroup.addView(radioButton3)
            radioGroup.addView(radioButton4)

            radioGroup.setOnCheckedChangeListener { group, checkedId ->
                var string = getString(R.string.you_selected)
                string += " " + getString(
                        if (checkedId == 1) R.string.black
                        else if (checkedId == 2) R.string.white
                        else if (checkedId == 2) R.string.blue
                        else R.string.green)
                Toast.makeText(applicationContext, string, Toast.LENGTH_SHORT).show()
            }

        }
    }
}