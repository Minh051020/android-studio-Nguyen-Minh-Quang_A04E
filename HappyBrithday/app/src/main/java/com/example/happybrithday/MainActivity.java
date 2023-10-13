package com.example.happybrithday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textEditHappyBrithday;
    TextView textEditFromEmma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textEditHappyBrithday =(TextView)findViewById(R.id.textView);
        textEditHappyBrithday.setText("HAPPY BIRTHDAY SAM!");

        textEditFromEmma =(TextView)findViewById(R.id.textView1);
        textEditFromEmma.setText("FROM EMMA");


    }
}