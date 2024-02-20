package com.example.mycounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.plus).setOnClickListener {
            counter++
            findViewById<TextView>(R.id.count).text = counter.toString()
        }

        findViewById<Button>(R.id.zero).setOnClickListener {
            counter = 0
            findViewById<TextView>(R.id.count).setText(counter.toString())
            }


    }
}