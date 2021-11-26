package com.example.balaipares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button button3 = findViewById(R.id.button3);

        button3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.button3:
                Intent intent2 = new Intent(Register.this, MainActivity.class);
                startActivity(intent2);
                break;

            default :
                break;
        }
    }
}