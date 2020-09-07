package com.example.parachute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RightAnswer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_answer);
    }

    public void nextQ(View v) {
        Button button = (Button)findViewById(R.id.NextQbtn);

        NextQuest();
    }

    public void NextQuest() {
        Intent intent = new Intent(this, GameActivity.class);

        startActivity(intent);
    }
}