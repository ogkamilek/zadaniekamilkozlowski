package com.example.zadaniekamilkozlowski

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ImageView>(R.id.imageView).setRotationY(30f)
        findViewById<ImageView>(R.id.imageView).setScaleX(2f)
        var iv = findViewById<ImageView>(R.id.imageView)
        //zmiana
        var b1 = findViewById<Button>(R.id.button)
        var b2 = findViewById<Button>(R.id.button2)

        b1.setOnClickListener {
            iv.setImageResource(R.drawable.zdj1);
        }
        b2.setOnClickListener {
            iv.setImageResource(R.drawable.zdj2);
        }
        //obrot
        var tx1 = findViewById<EditText>(R.id.editTextNumber)
        val fl1 = tx1.toString().toFloat()
        var b3 = findViewById<Button>(R.id.button3)
        var b4 = findViewById<Button>(R.id.button4)
        b3.setOnClickListener {
            iv.setRotationY(+fl1)
        }
        b4.setOnClickListener {
            iv.setRotationY(-fl1)
        }
        //skala
        var tx2 = findViewById<EditText>(R.id.editTextNumber2).text
        var b5 = findViewById<Button>(R.id.button6)
        val fl2 = tx2.toString().toFloat()
        b5.setOnClickListener {
            iv.setScaleX(fl2)
        }
        //alfa
        var tx3 = findViewById<EditText>(R.id.editTextNumber)
        val in3 = tx3.toString().toInt()
        var b6 = findViewById<Button>(R.id.button7)
        b6.setOnClickListener {
            iv.setImageAlpha(in3)
        }
    }
}

