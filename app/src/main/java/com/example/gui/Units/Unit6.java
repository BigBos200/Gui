package com.example.gui.Units;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gui.Focus.Efocus;
import com.example.gui.R;
import com.example.gui.ReadFromFile;

import java.util.Map;

public class Unit6 extends AppCompatActivity {

    private EditText editTxt6;
    private TextView txtView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit6);

        editTxt6 = findViewById(R.id.editTxt6);
        txtView6 = findViewById(R.id.txtView6);

        displayResults();


    }

    protected void displayResults(){
        editTxt6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                ReadFromFile<EditText, TextView> read = new ReadFromFile<>(editTxt6, txtView6);

            }
        });
    }
}