package com.example.activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    private Button btnMoveActivity;
    private Button btnMoveActivity2;
    private Button btnMoveActivity3;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMoveActivity = (Button)findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);
        btnMoveActivity2 = (Button)findViewById(R.id.btn_move_activity2);
        btnMoveActivity2.setOnClickListener(this);
        btnMoveActivity3 = (Button)findViewById(R.id.btn_move_activity3);
        btnMoveActivity3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, second_activity.class);
                text = btnMoveActivity.getText().toString();
                moveIntent.putExtra("one", text);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity2:
                Intent moveIntent2 = new Intent(MainActivity.this, second_activity.class);
                text = btnMoveActivity2.getText().toString();
                moveIntent2.putExtra("one", text);
                startActivity(moveIntent2);
                break;
            case R.id.btn_move_activity3:
                Intent moveIntent3 = new Intent(MainActivity.this, second_activity.class);
                text = btnMoveActivity3.getText().toString();
                moveIntent3.putExtra("one", text);
                startActivity(moveIntent3);
                break;
    }
}}