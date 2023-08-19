package com.example.gui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toolbar;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CardView {

    private androidx.cardview.widget.CardView Focus1, Focus2, Focus3, Focus4, Focus5;
    private ImageButton Settings;

    private Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);

        cardView(Focus1, R.id.Focus1);
        cardView(Focus2, R.id.Focus2);
        cardView(Focus3, R.id.Focus3);
        cardView(Focus4, R.id.Focus4);
        cardView(Focus5, R.id.Focus5);

        Settings = findViewById(R.id.Settings);
        Settings.setOnClickListener(this);

    }

    private void setSupportActionBar(Toolbar toolbar) {
        System.out.println("Lecim w tango!");
    }



    @Override
    public void onClick(View v) {
        choseFocus(v);
    }

    @Override
    public void cardView(androidx.cardview.widget.CardView name, int id) {
        name = findViewById(id);
        name.setOnClickListener((View.OnClickListener) this);
    }


    private void choseFocus(View v){

        Intent i;

        switch (v.getId()) {

            case R.id.Focus1:
                i = new Intent(MainActivity.this, com.example.gui.Focus.Focus1.Focus1.class);
                startActivity(i);
                break;
            case R.id.Focus2:
                i = new Intent(MainActivity.this, com.example.gui.Focus.Focus2.Focus2.class);
                startActivity(i);
                break;
            case R.id.Focus3:
                i = new Intent(MainActivity.this, com.example.gui.Focus.Focus3.Focus3.class);
                startActivity(i);
                break;
            case R.id.Focus4:
                i = new Intent(MainActivity.this, com.example.gui.Focus.Focus4.Focus4.class);
                startActivity(i);
                break;
            case R.id.Focus5:
                i = new Intent(MainActivity.this, com.example.gui.Focus.Focus5.Focus5.class);
                startActivity(i);
                break;
            case R.id.Settings:
                i = new Intent(MainActivity.this, com.example.gui.Focus.Settings.Settings.class);
                startActivity(i);
                break;

        }
    }

}