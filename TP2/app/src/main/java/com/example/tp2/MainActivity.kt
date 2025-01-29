package com.example.tp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputName = findViewById<EditText>(R.id.inputName)
        val btnValider = findViewById<Button>(R.id.btnValider)

        btnValider.setOnClickListener {
            val name = inputName.text.toString()

            val intent = Intent(this, MainActivity2::class.java)

            intent.putExtra("USER_NAME", name)

            startActivity(intent)
        }

    }
}