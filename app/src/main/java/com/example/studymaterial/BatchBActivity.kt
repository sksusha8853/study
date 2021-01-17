package com.example.studymaterial

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BatchBActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_batch_b)

        val ma105Button: Button = findViewById(R.id.button16)
        ma105Button.setOnClickListener{
            val intent6 = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1XxoTTckJZyhiUZh-73pSKuvr-q17dJef?usp=sharing"))
            startActivity(intent6)
        }
        val ph106Button: Button = findViewById(R.id.button15)
        ph106Button.setOnClickListener{
            val intent7 = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/16YHNLWxtxTQX6HZiOGu24aik1BbPiYz1?usp=sharing"))
            startActivity(intent7)
        }
        val ee104Button: Button = findViewById(R.id.button17)
        ee104Button.setOnClickListener{
            val intent8 = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1y1ZHXiVbFtVcfCtR9bb3FFOmeG87NphT?usp=sharing"))
            startActivity(intent8)
        }
        val hs108Button: Button = findViewById(R.id.button18)
        hs108Button.setOnClickListener{
            val intent9 = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/17phe--vX9LbLIFrqPPoYXdipAGEcJ4Hz?usp=sharing"))
            startActivity(intent9)
        }
        val me106Button: Button = findViewById(R.id.button19)
        me106Button.setOnClickListener{
            val intent10 = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1f4t4wnJV8u8eZh0pBtukUPQX17bMMtNy"))
            startActivity(intent10)
        }
        val bse102Button: Button = findViewById(R.id.button20)
        bse102Button.setOnClickListener{
            val intent11 = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1sUYRk-tvkjyOtzHsB48ok3p96oWV0vaR?usp=sharing"))
            startActivity(intent11)
        }
    }

}