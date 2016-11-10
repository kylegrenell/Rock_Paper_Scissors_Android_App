package com.example.user.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 09/11/2016.
 */

public class Game {

//  constructor
    private String mPlayerMove;
    private String mComputerMove;
    private String[] mPlays;


//  game play activity
    public Game(String play){
        this.mPlays = new String[3];
        setUpPlays();
        this.mPlayerMove = play;
        this.mComputerMove = new String();
    }

//    create a method that holds the game play values
    public void setUpPlays(){
        mPlays[0] = "rock";
        mPlays[1] = "paper";
        mPlays[2] = "scissors";
    }

    //call a method to get a random play for the computer
    public String computerMove() {

        Random rand = new Random();

        int randomIndex = rand.nextInt(3);

        mComputerMove = mPlays[randomIndex];

        return mComputerMove.toUpperCase();
    }

    //method to compare moves and decide a winner
    public String winChecker(){
        if (mPlayerMove == mComputerMove)
        {
            return "It's a tie!".toUpperCase();
        }
         else if (
            mPlayerMove == "rock" && mComputerMove == "scissors" ||
            mPlayerMove == "paper" && mComputerMove == "rock" ||
            mPlayerMove == "scissors" && mComputerMove == "paper")
        {
            return "You win!".toUpperCase();
        }
         else {
            return "Computer wins this time. Play again!".toUpperCase();
        }
    }

}



