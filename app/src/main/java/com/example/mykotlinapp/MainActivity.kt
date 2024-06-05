package com.example.mykotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var btn_plus : Button
    lateinit var btn_minus : Button
    lateinit var btn_multiply : Button
    lateinit var btn_divide : Button
    lateinit var enterA : EditText
    lateinit var enterB : EditText
    lateinit var resultTV : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_plus = findViewById(R.id.btn_plus)
        btn_minus = findViewById(R.id.btn_minus)
        btn_multiply = findViewById(R.id.btn_multiply)
        btn_divide = findViewById(R.id.btn_divide)

        btn_plus.setOnClickListener(this)
        btn_multiply.setOnClickListener(this)
        btn_divide.setOnClickListener(this)
        btn_minus.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var a = enterA.text.toString().toDouble()
        var b = enterB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_plus ->{
                result = a + b
            }
            R.id.btn_minus ->{
                result = a - b
            }
            R.id.btn_multiply ->{
                result =  a * b
            }
            R.id.btn_divide ->{
                result = a / b
            }
        }
        resultTV.text = "Result is $result"

    }
}