package com.example.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
       val text=findViewById<TextView>(R.id.textView2)
        val names= intent.extras?.getString("name")
        text.text="The Name Is: ${names.toString()}"
    }
}