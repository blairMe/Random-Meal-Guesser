package com.bfa.mealguesser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    //Array for storing the meals
    var foods = arrayListOf<String>("Bacon", "Pizzah", "Chicken", "Fries", "Tacos", "Pork")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Generating the random meal
        guessFood.setOnClickListener {
            val rand = Random()
            val randomMeal = rand.nextInt(foods.count())
            foodName.text = foods[randomMeal]
        }

        //Adding a meal to the array
        addFood.setOnClickListener {
            val newFood = insertFood.text.toString()
            foods.add(newFood)
            insertFood.text?.clear()
        }

    }

}