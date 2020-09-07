package com.example.parachute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void Theory (View v) {
        Button button = (Button)findViewById(R.id.Theory);

        openT();
    }

    public void openT() {
        Intent intent = new Intent(this, Theory.class);

        startActivity(intent);};

    public void StartGame (View v) {
        Button button = (Button)findViewById(R.id.StartBtn);

        StrtGm();
    }

    public void StrtGm() {
        Intent intent = new Intent(this, GameActivity.class);

        startActivity(intent);};

    public void HomeFromMain (View v) {
        Button button = (Button)findViewById(R.id.regMenueHomeBtn);

        MainHome();
    }

    public void MainHome() {
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);};
}