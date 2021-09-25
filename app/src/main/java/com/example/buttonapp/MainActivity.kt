package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var number = 0

    private lateinit var numberText: TextView
    private lateinit var plusBtn: TextView
    private lateinit var minusBtn: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberText = findViewById(R.id.tvNumber)
        plusBtn = findViewById(R.id.btnPlus)
        minusBtn = findViewById(R.id.btnMinus)

        plusBtn.setOnClickListener{
            updateNumber(true)
        }
        minusBtn.setOnClickListener{
            updateNumber(false)

        }

    }
    private fun updateNumber(add: Boolean){
        if(add){
           number++
        }else{
            number--
        }
        numberText.text = number.toString()
    }
}