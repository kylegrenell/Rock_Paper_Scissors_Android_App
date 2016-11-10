package com.example.user.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 09/11/2016.
 */

public class Main extends AppCompatActivity {

    TextView mInstructionText;
    Button mRockButton;
    Button mPaperButton;
    Button mScissorsButton;
    TextView mResultText;
    TextView mWinCheckerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d("Main", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// constructor for our
        mInstructionText = (TextView) findViewById(R.id.instruction_text);
        mRockButton = (Button) findViewById(R.id.rock_button);
        mPaperButton = (Button) findViewById(R.id.paper_button);
        mScissorsButton = (Button) findViewById(R.id.scissors_button);
        mResultText = (TextView) findViewById(R.id.result_text);
        mWinCheckerText = (TextView) findViewById(R.id.win_check_text);

        // Rock button needs to take user selection and return random answer from computerMove method in Game.java
        mRockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//              log to the terminal/monitor the activity
                Log.d("Main", "Rock button clicked");
//              new instance of Game class for rock selection
                Game game = new Game("rock");
//              display the randomised choice of computer
                String resultText = game.computerMove();
                mResultText.setText(resultText);
//              display the message of winning or losing from the above outcome
                String message = game.winChecker();
                mWinCheckerText.setText(message);
            }
        });


        // Paper button needs to take user selection and return random answer from computerMove method in Game.java
        mPaperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Main", "Paper button clicked");

                Game game = new Game("paper");

                String result = game.computerMove();
                mResultText.setText(result);

                String message = game.winChecker();
                mWinCheckerText.setText(message);
            }
        });


        // Scissor button needs to take user selection and return random answer from computerMove method in Game.java
        mScissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Main", "Scissors button clicked");

                Game game = new Game("scissors");

                String result = game.computerMove();
                mResultText.setText(result);

                String message = game.winChecker();
                mWinCheckerText.setText(message);

            }
        });
    }

}

