package com.example.homworknasledovnie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDub = findViewById<Button>(R.id.btnDub)
        val btnRoza = findViewById<Button>(R.id.btnRoza)
        val btnKaktus = findViewById<Button>(R.id.btnKaktus)

        val Dub = Dub()
        val Roza = Roza()
        val Kaktus = Kaktus()

        btnDub.setOnClickListener {
        Dub.rastet()
            Toast.makeText(this, "rastet Dub", Toast.LENGTH_SHORT).show()
        }
        btnRoza.setOnClickListener {
        Roza.rastet()
            Toast.makeText(this, "rastet Roza", Toast.LENGTH_SHORT).show()
        }
        btnKaktus.setOnClickListener {
        Kaktus.rastet()
            Toast.makeText(this, "rastet Kaktus", Toast.LENGTH_SHORT).show()
        }
    }
}