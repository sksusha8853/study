package com.example.studymaterial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val batchAButton: Button = findViewById(R.id.button7)
        batchAButton.setOnClickListener {
            val intent3 = Intent(this, BatchAActivity::class.java)
            startActivity(intent3)
        }

        val batchBButton:Button=findViewById(R.id.button8)
        batchBButton.setOnClickListener{
            val intent4=Intent(this,BatchBActivity::class.java)
            startActivity(intent4)
        }
    }
}