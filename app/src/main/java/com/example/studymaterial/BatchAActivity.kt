package com.example.studymaterial

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BatchAActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_batch_a)

        val cs103Button: Button = findViewById(R.id.button9)
        cs103Button.setOnClickListener{
          val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1JUKW2XjKErWRV_ax3mgxwDUBS7l5TYS4"))
            startActivity(intent)
        }

        val ph105Button: Button = findViewById(R.id.button10)
        ph105Button.setOnClickListener{
            val intent1 = Intent(Intent.ACTION_VIEW, Uri.parse("link for ph105"))
            startActivity(intent1)
        }
        val hs159Button: Button = findViewById(R.id.button11)
        hs159Button.setOnClickListener{
            val intent2 = Intent(Intent.ACTION_VIEW, Uri.parse("link for hs159"))
            startActivity(intent2)
        }
        val ic153Button: Button = findViewById(R.id.button12)
        ic153Button.setOnClickListener{
            val intent3 = Intent(Intent.ACTION_VIEW, Uri.parse("link for ic153"))
            startActivity(intent3)
        }
        val ma105Button: Button = findViewById(R.id.button13)
        ma105Button.setOnClickListener{
            val intent4 = Intent(Intent.ACTION_VIEW, Uri.parse("link for ma105"))
            startActivity(intent4)
        }
        val ch103Button: Button = findViewById(R.id.button14)
        ch103Button.setOnClickListener{
            val intent5 = Intent(Intent.ACTION_VIEW, Uri.parse("link for ch103"))
            startActivity(intent5)
        }



        }
    }
