package com.example.diceroller

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button : Button = findViewById(R.id.btn_roleDice)

        button.setOnClickListener {
            RoleDice()
        }


    }


    private fun RoleDice() {
        // RANDOM GAIN
        val randomNumber = Random.nextInt(6)+1

        // TEXT VIEW ELEMENTS
        var output : TextView = findViewById(R.id.tv_Output)
        output.text = randomNumber.toString()


        //IMAGE VIEW ELEMENTS
        val image : ImageView = findViewById(R.id.iv_DiceImage)

        val imageResource= when (randomNumber) {
            1 ->  R.drawable.dice_1
            2 ->  R.drawable.dice_2
            3 ->  R.drawable.dice_3
            4 ->  R.drawable.dice_4
            5 ->  R.drawable.dice_5
            else ->  R.drawable.dice_6
        }
        image.setImageResource(imageResource)
    }

}


