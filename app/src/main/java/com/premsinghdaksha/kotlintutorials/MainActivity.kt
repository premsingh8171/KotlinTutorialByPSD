package com.premsinghdaksha.kotlintutorials

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autoTextView = AutoCompleteTextView(this)
        val button = Button(this)
        val layoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        autoTextView.layoutParams = layoutParams
        button.layoutParams = layoutParams
        layoutParams.setMargins(30, 30, 30, 30)
        autoTextView.setHint(R.string.hint)
        button.setText("Submit")

        val linearLayout = findViewById<LinearLayout>(R.id.linear_layout)
        //add AutoCompleteTextView and button to LinearLayout
        linearLayout?.addView(autoTextView)
        linearLayout?.addView(button)

        //Get the array of languages
        val languages = resources.getStringArray(R.array.Languages)
        // Create adapter and add in AutoCompleteTextView
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, languages
        )
        autoTextView.setAdapter(adapter)

        if (button != null) {
            button?.setOnClickListener(View.OnClickListener {
                val enteredText = getString(R.string.submitted_lang) + " " +
                        autoTextView.getText()
                Toast.makeText(
                    this@MainActivity,
                    enteredText, Toast.LENGTH_SHORT
                ).show()
            })
        }
    }
}