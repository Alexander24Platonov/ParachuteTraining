package com.example.parachute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Log (View v) {
        Button button = (Button)findViewById(R.id.regBtn);

        openMainMenue();
    }

    public void openMainMenue() {
        Intent intent = new Intent(this, MainMenu.class);

        startActivity(intent);};
}