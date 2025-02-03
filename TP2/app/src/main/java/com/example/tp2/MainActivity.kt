package com.example.tp2

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputName = findViewById<EditText>(R.id.inputName)
        val inputAnnee = findViewById<EditText>(R.id.inputAnnee)
        val displayName = findViewById<TextView>(R.id.displayName)
        val btnValider = findViewById<Button>(R.id.btnValider)

        inputName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                displayName.text = s
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        btnValider.setOnClickListener {
            val name = inputName.text.toString().trim()

            val year = inputAnnee.text.toString().toIntOrNull()

            if (name.isEmpty()) {
                Toast.makeText(this, "Veuillez entrer un nom", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (year == null) {
                Toast.makeText(this, "Veuillez entrer une année", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            else{
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("USER_NAME", name)
                intent.putExtra("USER_YEAR", year)
                startActivity(intent)
            }
        }
    }
}