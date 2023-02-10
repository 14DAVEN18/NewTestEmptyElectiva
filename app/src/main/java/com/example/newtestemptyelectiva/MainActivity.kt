package com.example.newtestemptyelectiva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var rightNumber = 0
    var leftNumber = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        generateRandom()
    }

    fun doClickRight(v1:View) {
        if (rightNumber > leftNumber) {
            Toast.makeText(this,  "You win!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this,  "Try again", Toast.LENGTH_SHORT).show()
        }
        generateRandom()
    }

    fun doClickLeft(v1: View) {
        if (rightNumber < leftNumber) {
            Toast.makeText(this,  "You win!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this,  "Try again", Toast.LENGTH_SHORT).show()
        }
        generateRandom()
    }

    fun generateRandom() {
        rightNumber = Random.nextInt(0,10)
        leftNumber = (0..100).random()
    }
}