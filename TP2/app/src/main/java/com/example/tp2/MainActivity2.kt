package com.example.tp2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val displayText = findViewById<TextView>(R.id.displayText)

        val name = intent.getStringExtra("USER_NAME")
        val year = intent.getIntExtra("USER_YEAR",-1)

        val age = AgeCalculator.calculateAge(year)
        displayText.text = "Hello $name, vous êtes né en $year. Vous avez $age ans."
    }
}