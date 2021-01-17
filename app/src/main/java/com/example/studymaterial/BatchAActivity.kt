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
            val intent1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1b888FHqoKV2BjOtTT0EDZacOE10isEnj?usp=sharing"))
            startActivity(intent1)
        }
        val hs159Button: Button = findViewById(R.id.button11)
        hs159Button.setOnClickListener{
            val intent2 = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1eFK5OYjRSIPOuVI3jFzHM9fm5yDfsLgq?usp=sharing"))
            startActivity(intent2)
        }
        val ic153Button: Button = findViewById(R.id.button12)
        ic153Button.setOnClickListener{
            val intent3 = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1-urP7sC6hqEaMCVi2WcxFqBAneoMaDTY?usp=sharing"))
            startActivity(intent3)
        }
        val ma105Button: Button = findViewById(R.id.button13)
        ma105Button.setOnClickListener{
            val intent4 = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1o2-oDlFaOaFbQZntkuPA2eqrydFUDs0k?usp=sharing"))
            startActivity(intent4)
        }
        val ch103Button: Button = findViewById(R.id.button14)
        ch103Button.setOnClickListener{
            val intent5 = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1PrCpZ6seGtWP1on-eNloTj4oU4c8cGZh?usp=sharing"))
            startActivity(intent5)
        }



        }
    }
