package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayA(int score){
        TextView firstTeamView = (TextView) findViewById(R.id.first_team_point);
        firstTeamView.setText("" + score);
    }

    public void displayB(int score){
        TextView secondTeamView = (TextView) findViewById(R.id.second_team_point);
        secondTeamView.setText("" + score);
    }

    public void threePointerTeamA(View view){
        teamAScore = teamAScore + 3;
        displayA(teamAScore);
    }

    public void twoPointerTeamA(View view){
        teamAScore = teamAScore + 2;
        displayA(teamAScore);
    }

    public void freeThrowPointerTeamA(View view){
        teamAScore = teamAScore + 1;
        displayA(teamAScore);
    }

    // FUNCTIONALITIES FOR TEAM B
    public void threePointerTeamB(View view){
        teamBScore = teamBScore + 3;
        displayB(teamBScore);
    }

    public void twoPointerTeamB(View view){
        teamBScore = teamBScore + 2;
        displayB(teamBScore);
    }

    public void freeThrowPointerTeamB(View view){
        teamBScore = teamBScore + 1;
        displayB(teamBScore);
    }

    public void reset(View view){
        teamAScore = 0;
        teamBScore = 0;
        displayA(teamAScore);
        displayB(teamBScore);
    }
}
