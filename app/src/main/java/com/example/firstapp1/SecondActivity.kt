package com.example.firstapp1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    companion object{
        const val MESSAGE = "message"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        getMessage()
    }
    fun getMessage(){
        val message = intent.getStringExtra(MESSAGE)
        val textView = findViewById<TextView>(R.id.messageView)
        textView.text = message
    }
    fun backToStart(view: View){
        val returnIntent = Intent(this, MainActivity::class.java)
        startActivity(returnIntent)
    }
}