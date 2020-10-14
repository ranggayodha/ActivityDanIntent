package com.example.activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {
    private TextView textextra;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity2);

        textextra = findViewById(R.id.scroll1);
        Intent move = getIntent();
        text = move.getStringExtra("one");
        textextra.setText(text);

        TextView tv = (TextView)findViewById(R.id.scroll1);
        tv.setMovementMethod(new ScrollingMovementMethod());
    }
}