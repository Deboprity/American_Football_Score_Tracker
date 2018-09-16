package com.example.android.americanfootballscoretracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* Variable to store score for Team A */
    int scoreA = 0;
    /* Variable to store score for Team B */
    int scoreB = 0;
    /* Variable to store the initial scores of the two teams */
    public static int initialScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(initialScore); /*Displays the initial score for team A as 0*/
        displayForTeamB(initialScore); /*Displays the initial score for team B as 0*/
    }

    /* Display score for Team A */
    public void displayForTeamA(int displayScoreA){
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(displayScoreA));
    }

    /*Display score for Team B */
    public void displayForTeamB(int displayScoreB){
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(displayScoreB));
    }

    /*Add 6 points for Team A : Touchdown +6*/
    public void addPointSixA(View view) {
        scoreA += 6;
        displayForTeamA(scoreA);
    }

    /*Add 3 points for Team A : Field goal +3*/
    public void addPointThreeA(View view) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    /*Add 2 points for Team A : Two point conversation +2*/
    public void addPointTwoA(View view) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    /*Add 2 points for Team A : Safety +2*/
    public void addPointSafetyTwoA(View view) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    /*Add 1 point for Team A : Extra point +1*/
    public void addPointOneA(View view) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    /*Add 6 points for Team B : Touchdown +6*/
    public void addPointSixB(View view) {
        scoreB += 6;
        displayForTeamB(scoreB);
    }

    /*Add 3 points for Team B : Field goal +3*/
    public void addPointThreeB(View view) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    /*Add 2 points for Team B : Two point conversation +2*/
    public void addPointTwoB(View view) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    /*Add 2 points for Team B : Safety +2*/
    public void addPointSafetyTwoB(View view) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    /*Add 1 point for Team B : Extra point +1*/
    public void addPointOneB(View view) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    /*Resets the Scores for both the teams*/
    public void resetScore(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(initialScore);
        displayForTeamB(initialScore);
    }
}
