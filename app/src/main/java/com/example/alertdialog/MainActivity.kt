package com.example.alertdialog

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
lateinit var textt:TextView

    var out:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       textt=findViewById<TextView>(R.id.textView3)
        var btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            customAlert()

        }
    }
    private fun customAlert() {

        val dialogBuilder = AlertDialog.Builder(this)

        val input = EditText(this)


        dialogBuilder.setMessage("Enter Your Name")

            .setPositiveButton("TV",
                DialogInterface.OnClickListener { dialog, id ->
                   out= input.text.toString()
                    textt.text="The Name Is : ${out.toString()}"


                })

            .setNegativeButton("Go",
                DialogInterface.OnClickListener { dialog, id ->
                    val intent = Intent(this, MainActivity2::class.java)
                    out= input.text.toString()
                    intent.putExtra("name", out)
                    startActivity(intent)
                })


        val alert = dialogBuilder.create()

        alert.setTitle("Name")
        alert.setView(input)
        alert.show()
    }
}