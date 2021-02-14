package com.premsinghdaksha.kotlintutorials

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seekBar = seekBar
        seekBar?.setOnSeekBarChangeListener(@SuppressLint("AppCompatCustomView")
        object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                //here we can write some code to do something when progress is changed
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                //here we can write some code to do something whenever the user touche the seekbar
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // show some message after user stopped scrolling the seekbar
                Toast.makeText(
                    this@MainActivity, "Discrete Value of SeekBar is  " + seekBar.progress,
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }
}