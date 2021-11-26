package com.example.balaipares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton3 = findViewById(R.id.imageButton3);

        imageButton1.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageButton1:
                Intent intent1 = new Intent(Menu.this, ParesAddons.class);
                startActivity(intent1);
                break;
            case R.id.imageButton2:
                Intent intent2 = new Intent(Menu.this, MamiAddons.class);
                startActivity(intent2);
                break;
            case R.id.imageButton3:
                Intent intent3 = new Intent(Menu.this, Drinks.class);
                startActivity(intent3);
                break;
        }
        }
}