package com.premsinghdaksha.kotlintutorials

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get radio group selected item using on checked change listener
        radio_group.setOnCheckedChangeListener(
                RadioGroup.OnCheckedChangeListener { group, checkedId ->
                    val radio: RadioButton = findViewById(checkedId)
                    Toast.makeText(applicationContext," On checked change :"+ " ${radio.text}", Toast.LENGTH_SHORT).show()
                })

        // Get radio group selected status and text using button click event
        button.setOnClickListener{
            // Get the checked radio button id from radio group
            var id: Int = radio_group.checkedRadioButtonId
            if (id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(id)
                Toast.makeText(applicationContext,"On button click :" + " ${radio.text}", Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" + " nothing selected", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Get the selected radio button text using radio button on click listener
    fun radio_button_click(view: View){
        // Get the clicked radio button instance
        val radio: RadioButton = findViewById(radio_group.checkedRadioButtonId)
        Toast.makeText(applicationContext,"On click : ${radio.text}", Toast.LENGTH_SHORT).show()
    }
}