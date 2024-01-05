package com.example.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        this.showResultRound()
        this.showMove()
    }

    private fun showResultRound() {
        val resultImg = findViewById<ImageView>(R.id.result_image)
        val result = intent.getStringExtra("RESULT")
        if (result == "win")
            resultImg.setImageResource(R.drawable.winimg)
        else if (result == "loose")
            resultImg.setImageResource(R.drawable.looseimg)
        else if (result == "tie")
            resultImg.setImageResource(R.drawable.tieimg)
    }

    private fun showMove() {
        val playerMove = findViewById<ImageView>(R.id.player_move)
        val compMove = findViewById<ImageView>(R.id.comp_move)
        val signPlayer = intent.getStringExtra("SIGN_PLAYER")
        val signComp = intent.getStringExtra("SIGN_COMP")

        if (signPlayer == "rock")
            playerMove.setImageResource(R.drawable.rock)
        else if (signComp == "rock")
            compMove.setImageResource(R.drawable.rock)
        else if (signPlayer == "cut")
            playerMove.setImageResource(R.drawable.scissors)
        else if (signComp == "cut")
            compMove.setImageResource(R.drawable.scissors)
        else if (signPlayer == "paper")
            playerMove.setImageResource(R.drawable.paper)
        else if (signComp == "paper")
            compMove.setImageResource(R.drawable.paper)
    }
}