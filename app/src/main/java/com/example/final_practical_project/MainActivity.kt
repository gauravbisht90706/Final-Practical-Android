package com.example.final_practical_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    val restartButton = findViewById<Button>(R.id.restartButton)
    val scissorButton = findViewById<Button>(R.id.scissor)
    val paperButton  = findViewById<Button>(R.id.paper)
    val rockButton = findViewById<Button>(R.id.rock)
    val yourTurn = findViewById<TextView>(R.id.your_turn)
    val computerTurn = findViewById<TextView>(R.id.computer_turn)
    val yourScore = findViewById<TextView>(R.id.your_score)
    val computerScore = findViewById<TextView>(R.id.computer_score)
    val winnerText = findViewById<TextView>(R.id.winner)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        restartButton.setOnClickListener {
            clearScore()
        }

        // when player click on scissor icon.
        scissorButton.setOnClickListener {
                  yourTurn.text = "Scissor"


            // choose a random number between 1 to 3.
            val computer_move = (1..4).random()

            if(computer_move == 1) {
                // set the image of computer move to rock
                computerTurn.text = "Rock"

                // rock beats scissors.
                winnerText.text = "Computer Won"

                // increase the computer score
                val cscore: Int = computerScore.text.toString().toInt() + 1
                computerScore.text = cscore.toString()

            } else if (computer_move == 2) {

                // set the image of computer move to paper
                computerTurn.text = "Paper"

                // scissors beats paper
                winnerText.text = "Player has won"

                // increase the player score
                val pscore: Int = yourScore.text.toString().toInt() + 1
                yourScore.text = pscore.toString()
            } else {

                // set the image of computer move to scissors

                    computerTurn.text = "Scissor"

                // both user move and computer move are "scissors"
                winnerText.text = "Draw"
            }

        }

        // when player clicks on  paper icon
        paperButton.setOnClickListener {

            // set the image of player move to paper
            yourTurn.text = "Paper"


            val computer_move = (1..4).random()



            if(computer_move == 1) {

                // set the image of computer move to rock
               computerTurn.text = "Rock"

                // paper beats rock
                winnerText.text = "Player has won"

                // increase count of player score
                val pscore: Int = yourScore.text.toString().toInt() + 1
                yourScore.text = pscore.toString()
            }
            else if (computer_move == 2) {

                // set the image of computer move to paper
                computerTurn.text = "Paper"

                // both user move and computer move are "paper"
                winnerText.text = "Draw"
            } else {

                // set the image of computer move to scissors

                computerTurn.text = "Scissor"
                // scissors beats paper
                winnerText.text = "Computer has won"

                // increase the computer score
                val cscore: Int = computerScore.text.toString().toInt() + 1
                computerScore.text = cscore.toString()
            }

        }

        // when player click on rock icon.
        rockButton.setOnClickListener {

            // set the image of user move to rock
            yourTurn.text = "Rock"


            val computer_move = (1..4).random()



            if (computer_move == 1) {
                // set the image of computer move to rock
                computerTurn.text = "Rock"

                // both user  and computer moves are rock
                winnerText.text = "Draw"

            } else if (computer_move == 2) {

                // set the image of computer move to paper
               computerTurn.text = "Paper"

                // paper beats rock
                winnerText.text = "Computer has won"

                // increase the computer score
                val cscore: Int = computerScore.text.toString().toInt() + 1
                computerScore.text = cscore.toString()


            } else {
                // set the image of computer move to scissors
                computerTurn.text = "Scissor"

                // rock beats scissors
                winnerText.text = "Player has won"

                // increase the count of plyer
                val pscore: Int = yourScore.text.toString().toInt() + 1
               yourScore.text = pscore.toString()
            }
        }
    }

    private fun clearScore() {

        // set the computer and player score to 0
        computerScore.text = "0"
        yourScore.text = "0"

        winnerText.text = ""

        // set the images of computer move and user move to "Question mark image".


    }

}





