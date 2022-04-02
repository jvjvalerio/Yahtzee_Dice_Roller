package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ImageView and RollButtons
        val dice1ImageView: ImageView = findViewById(R.id.dice1)
        val dice2ImageView: ImageView = findViewById(R.id.dice2)
        val dice3ImageView: ImageView = findViewById(R.id.dice3)
        val dice4ImageView: ImageView = findViewById(R.id.dice4)
        val dice5ImageView: ImageView = findViewById(R.id.dice5)
        val rollButton: Button = findViewById(R.id.rollButton)
        val dice = Dice(6)

        // Action upon button press
        rollButton.setOnClickListener {

            // Roll dice1
            val drawableResource = when (dice.roll()) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            dice1ImageView.setImageResource(drawableResource)

            // Roll dice2
            val drawableResource2 = when (dice.roll()) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            dice2ImageView.setImageResource(drawableResource2)

            // Roll dice3
            val drawableResource3 = when (dice.roll()) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            dice3ImageView.setImageResource(drawableResource3)

            // Roll dice4
            val drawableResource4 = when (dice.roll()) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            dice4ImageView.setImageResource(drawableResource4)

            // Roll dice5
            val drawableResource5 = when (dice.roll()) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            dice5ImageView.setImageResource(drawableResource5)
        }
    }
}

// Dice class to set number of sides
class Dice(private val sides: Int) {

    // Function to roll dice and return number
    fun roll(): Int {
        return (1..sides).random()
    }
}