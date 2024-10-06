package com.example.testoncloseproject

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var editTextEnter: EditText
    private lateinit var viewTextResult: TextView
    private lateinit var textView: TextView
    private lateinit var button: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        editTextEnter = findViewById(R.id.editTextEnter)
        viewTextResult = findViewById(R.id.textViewResult)
        textView = findViewById(R.id.textViewCount)
        button = findViewById(R.id.buttonResult)
    }

    fun onButtonClick(view: View){
        var getText = editTextEnter.text.toString()
        var countChar = getText.replace(" ","").length.toString()
        getText = getText.reversed()
        viewTextResult.setText(getText)
        textView.text = countChar
    }
}