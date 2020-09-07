package com.example.parachute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Theory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory);
    }

    public void Home (View v) {
        Button button = (Button)findViewById(R.id.MainMenueFromTheory);

        openMainMenue();
    }

    public void openMainMenue() {
        Intent intent = new Intent(this, MainMenu.class);

        startActivity(intent);};
}