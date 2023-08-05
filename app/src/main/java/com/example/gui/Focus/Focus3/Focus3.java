package com.example.gui.Focus.Focus3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gui.CardView;
import com.example.gui.Focus.Efocus;
import com.example.gui.R;
import com.example.gui.ReadFromFile;

public class Focus3 extends AppCompatActivity implements View.OnClickListener, CardView {

    private androidx.cardview.widget.CardView Unit1, Unit2, Unit3, Unit4, Unit5, Unit6, Unit7, Unit8;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        cardView(Unit1, R.id.Unit1);
        cardView(Unit2, R.id.Unit2);
        cardView(Unit3, R.id.Unit3);
        cardView(Unit4, R.id.Unit4);
        cardView(Unit5, R.id.Unit5);
        cardView(Unit6, R.id.Unit6);
        cardView(Unit7, R.id.Unit7);
        cardView(Unit8, R.id.Unit8);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {

            case R.id.Unit1:
                ReadFromFile<Efocus, Efocus> sfu1 = new ReadFromFile<>(Efocus.EFOCUS3, Efocus.EUNIT1);
                i = new Intent(Focus3.this, com.example.gui.Focus.Focus3.Units.Unit1.class);
                startActivity(i);
                break;
            case R.id.Unit2:
                ReadFromFile<Efocus, Efocus> sfu2 = new ReadFromFile<>(Efocus.EFOCUS3, Efocus.EUNIT2);
                i = new Intent(Focus3.this, com.example.gui.Focus.Focus3.Units.Unit2.class);
                startActivity(i);
                break;
            case R.id.Unit3:
                ReadFromFile<Efocus, Efocus> sfu3 = new ReadFromFile<>(Efocus.EFOCUS3, Efocus.EUNIT3);
                i = new Intent(Focus3.this, com.example.gui.Focus.Focus3.Units.Unit3.class);
                startActivity(i);
                break;
            case R.id.Unit4:
                ReadFromFile<Efocus, Efocus> sfu4 = new ReadFromFile<>(Efocus.EFOCUS3, Efocus.EUNIT4);
                i = new Intent(Focus3.this, com.example.gui.Focus.Focus3.Units.Unit4.class);
                startActivity(i);
                break;
            case R.id.Unit5:
                ReadFromFile<Efocus, Efocus> sfu5 = new ReadFromFile<>(Efocus.EFOCUS3, Efocus.EUNIT5);
                i = new Intent(Focus3.this, com.example.gui.Focus.Focus3.Units.Unit5.class);
                startActivity(i);
                break;
            case R.id.Unit6:
                ReadFromFile<Efocus, Efocus> sf6 = new ReadFromFile<>(Efocus.EFOCUS3, Efocus.EUNIT6);
                sf6.readFocus();
                i = new Intent(Focus3.this, com.example.gui.Focus.Focus3.Units.Unit6.class);
                startActivity(i);
                break;
            case R.id.Unit7:
                ReadFromFile<Efocus, Efocus> sfu7 = new ReadFromFile<>(Efocus.EFOCUS3, Efocus.EUNIT7);
                i = new Intent(Focus3.this, com.example.gui.Focus.Focus3.Units.Unit7.class);
                startActivity(i);
                break;
            case R.id.Unit8:
                ReadFromFile<Efocus, Efocus> sfu8 = new ReadFromFile<>(Efocus.EFOCUS3, Efocus.EUNIT8);
                i = new Intent(Focus3.this, com.example.gui.Focus.Focus3.Units.Unit8.class);
                startActivity(i);
                break;
        }
    }

    @Override
    public void cardView(androidx.cardview.widget.CardView name, int id) {
        name = findViewById(id);
        name.setOnClickListener(this);
    }
}