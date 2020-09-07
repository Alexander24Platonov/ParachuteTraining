package com.example.parachute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Picture;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;


public class GameActivity extends AppCompatActivity {

    int rightAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rightAnswer = 0;
    }



    public void Next(View v) {
        //ImageView img = (ImageView)findViewById(R.id.imageView);
        //img.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.ic_launcher_background));
        Button button = (Button)findViewById(R.id.NextBtn);

    nextPlusImg();

        //String g[] = {"abc","asd"};

         //Random random    = new Random();
          //int answ1 = random.nextInt(g.length - 0) + 0;
            //textView.setText(g[answ1]);

//        RadioButton answ1 = (RadioButton)findViewById(R.id.answ1,);
//        RadioButton answ2 = (RadioButton)findViewById(R.id.answ2,);
//        RadioButton answ3 = (RadioButton)findViewById(R.id.answ3,);
//        RadioButton answ4 = (RadioButton)findViewById(R.id.answ4,);
//        public void Red(View v){
//            EditText editText = (EditText)findViewById(R.id.);
//            TextView textView = (TextView)findViewById(R.id.answ1);
//            TextView textView = (TextView)findViewById(R.id.answ2);
//            TextView textView = (TextView)findViewById(R.id.answ3);
//            TextView textView = (TextView)findViewById(R.id.answ4);
//            textView.setText(editText.getText());
        }

        public void nextPlusImg() {
            ImageView img = (ImageView)findViewById(R.id.imageView);



            img.setImageResource(R.drawable.ic_launcher_foreground);


            Intent intent = new Intent(this, RightAnswer.class);
            startActivity(intent);


        };

    public void NextChangeAnsws(View v) {
        Button button = (Button)findViewById(R.id.answBtn1);

        nextChange();
    };

    public void nextChange() {
        Button button = (Button)findViewById(R.id.answBtn1);
        button.setBackground(getResources().getDrawable(R.drawable.skull));


    }
}




