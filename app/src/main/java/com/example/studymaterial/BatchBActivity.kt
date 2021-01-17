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
            val intent6 = Intent(Intent.ACTION_VIEW, Uri.parse("link for ma105"))
            startActivity(intent6)
        }
        val ph106Button: Button = findViewById(R.id.button15)
        ph106Button.setOnClickListener{
            val intent7 = Intent(Intent.ACTION_VIEW, Uri.parse("link for ph106"))
            startActivity(intent7)
        }
        val ee104Button: Button = findViewById(R.id.button17)
        ee104Button.setOnClickListener{
            val intent8 = Intent(Intent.ACTION_VIEW, Uri.parse("link for ma105"))
            startActivity(intent8)
        }
        val hs108Button: Button = findViewById(R.id.button18)
        hs108Button.setOnClickListener{
            val intent9 = Intent(Intent.ACTION_VIEW, Uri.parse("link for hs108"))
            startActivity(intent9)
        }
        val me106Button: Button = findViewById(R.id.button19)
        me106Button.setOnClickListener{
            val intent10 = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1f4t4wnJV8u8eZh0pBtukUPQX17bMMtNy"))
            startActivity(intent10)
        }
        val bse102Button: Button = findViewById(R.id.button20)
        bse102Button.setOnClickListener{
            val intent11 = Intent(Intent.ACTION_VIEW, Uri.parse("link for bse102"))
            startActivity(intent11)
        }
    }

}