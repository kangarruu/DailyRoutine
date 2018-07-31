package com.example.android.dailyroutine;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.dailyroutine.R;

public class MainActivity extends AppCompatActivity {

    int scoreNoa = 0;
    int scoreGavi = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Noa.
     */

    public void displayForNoa(int score) {
        TextView scoreView = (TextView) findViewById(R.id.noa_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Gavi.
     */

    public void displayForGavi(int score) {
        TextView scoreView = (TextView) findViewById(R.id.gavi_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the task buttons for Noa are clicked.
     */

    public void incrementForNoa(View view) {
        scoreNoa = scoreNoa + 1;
        displayForNoa(scoreNoa);
    }

    /**
     * This method is called when the warning button for Noa is clicked.
     */

    public void decrementForNoa(View view) {
        scoreNoa = scoreNoa - 1;
        displayForNoa(scoreNoa);

    }

    /**
     * This method adds 2 points when certain tasks for Noa are clicked.
     */

    public void plusTwoForNoa (View view) {
        scoreNoa = scoreNoa + 2;
        displayForNoa(scoreNoa);
    }

    /**
     * This method is called when the task buttons for Gavi are clicked.
     */

    public void incrementForGavi(View view) {
        scoreGavi = scoreGavi + 1;
        displayForGavi(scoreGavi);

        }

    /**
     * This method is called when the warning button for Gavi is clicked.
     */

    public void decrementForGavi(View view) {
        scoreGavi = scoreGavi - 1;
        displayForGavi(scoreGavi);

        }

    /**
     * This method adds 2 points when certain tasks for Gavi are clicked.
     */

    public void plusTwoForGavi (View view) {
        scoreGavi = scoreGavi + 2;
        displayForGavi(scoreGavi);
    }

    /**
     * Resets scores for Noa and Gavi to 0.
     */

    public void resetScores (View view) {
        scoreNoa = 0;
        scoreGavi = 0;
        displayForNoa(scoreNoa);
        displayForGavi(scoreGavi);
    }

    /**Saves the current values of the scores right before activity is paused or screen is rotated.
     * @param outState
     * I learned how to use this method in the following youtube tutorial: https://www.youtube.com/watch?v=-BcDangSSZk&t=24s but I implemented the code myself.
     */

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("SCORE1", scoreNoa);
        outState.putInt("SCORE2", scoreGavi);

    }

    /** Repopulates valued from the bundle created in the onSaveInstantState method.
     * @param savedInstanceState
     * I learned how to use this method in the following youtube tutorial: https://www.youtube.com/watch?v=-BcDangSSZk&t=24s but I implemented the code myself.
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreNoa = savedInstanceState.getInt("SCORE1");
        scoreGavi = savedInstanceState.getInt("SCORE2");
        displayForNoa(scoreNoa);
        displayForGavi(scoreGavi);
    }
}
