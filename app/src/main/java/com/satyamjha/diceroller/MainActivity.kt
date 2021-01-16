package com.satyamjha.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)


        rollButton.setOnClickListener {
            rollfunc()
        }
    }
    private fun rollfunc(){

        val dice = Dice( 6)

        val diceImage: ImageView = findViewById(R.id.dice_Image)
        val randNum = dice.roll()
        val luckyNum=6
        val imageRes=when (randNum) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else->R.drawable.dice_6
                

        }

        diceImage.setImageResource(imageRes)

    }
}

class Dice(private val numSides:Int){
    fun roll():Int{
        return(1..numSides).random()
    }
}