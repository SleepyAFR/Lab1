package com.example.lab1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        val textView = findViewById<TextView>(R.id.textView)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.orabutton)
        button.setOnClickListener {
            if(counter < 100){
            Log.v("Hello world", "Button clicked!")
            counter++
            textView.text = counter.toString()
        }
            else if (counter >= 100){
                Log.v("Hello world", "Button clicked!")
                counter += 2
                textView.text = counter.toString()
                }
            }
    }

}