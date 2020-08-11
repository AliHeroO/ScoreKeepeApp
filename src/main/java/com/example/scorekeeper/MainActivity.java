package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreLiv = 0;
    int scoremanCity = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


/*calle method*/

    //liverpool
    // Goal " add 1 " for liverpool team
    public void goalLivButton (View view) {
        scoreLiv = scoreLiv + 1 ;
        displayscoreLiverpool(scoreLiv);
        GoalLive("Gooooal");
    }

    // foul for manCity team
    public void foulLiverpoolbutton (View view) {
        displayFoulLiv("Foul");
    }

    // corner for manCity team
    public void cornerLiverpoolbutton (View view) {
        displayCornerLiv("Corner");
    }

    //Mancity
    // Goal " add 1 " for manCity team
    public void goalManCityButton (View view) {
        scoremanCity = scoremanCity + 1 ;
        displayScoreManCity(scoremanCity);
        GoalMan("Gooooal");
    }

    // foul for manCity team
    public void foulManCityButton (View view) {
        displayFoulMan("Foul");
    }

    // corner for manCity team
    public void cornerManCityButton (View view) {
        displayCornerMan("Corner");
    }

    // reset
    public void resetButton (View view) {
        scoreLiv = 0 ;
        scoremanCity = 0;
        displayscoreLiverpool(scoreLiv);
        displayScoreManCity(scoremanCity);
        GoalLive("");
        GoalMan("");
    }




/*display*/

    //Liverpool.
    //Displays score for Liverpool.
    public void displayscoreLiverpool(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreLiv);
        scoreView.setText(String.valueOf(score));
    }

    //Displays foul for Mancity.
    public void displayFoulLiv(String score) {
        TextView scoreView = (TextView) findViewById(R.id.displayLiv);
        scoreView.setText(String.valueOf(score));
    }

    //Displays courner for Mancity.
    public void displayCornerLiv(String score) {
        TextView scoreView = (TextView) findViewById(R.id.displayLiv);
        scoreView.setText(String.valueOf(score));
    }

    //Displays Goal for Liverpool.
    public void GoalLive(String score) {
        TextView scoreView = (TextView) findViewById(R.id.displayLiv);
        scoreView.setText(String.valueOf(score));
    }



    //Mancity.
    //Displays score for Mancity.
    public void displayScoreManCity(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreMan);
        scoreView.setText(String.valueOf(score));
    }

    //Displays foul for Mancity.
    public void displayFoulMan(String score) {
        TextView scoreView = (TextView) findViewById(R.id.displayMan);
        scoreView.setText(String.valueOf(score));
    }

    //Displays courner for Mancity.
    public void displayCornerMan(String score) {
        TextView scoreView = (TextView) findViewById(R.id.displayMan);
        scoreView.setText(String.valueOf(score));
    }

    //Displays GoalManCity for Mancity.
    public void GoalMan(String score) {
        TextView scoreView = (TextView) findViewById(R.id.displayMan);
        scoreView.setText(String.valueOf(score));
    }
}
