package com.example.classwork7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hello = "Hello"
        val number1 = 100
        val number2 = 111
        val number3 = 888

        println(hello)
        println(number1 + number2 + number3)
    }
}