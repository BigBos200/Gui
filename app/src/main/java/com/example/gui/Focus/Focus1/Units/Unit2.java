package com.example.gui.Focus.Focus1.Units;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gui.Focus.Efocus;
import com.example.gui.R;
import com.example.gui.ReadFromFile;

public class Unit2 extends AppCompatActivity {
    private EditText editTxt12;
    private TextView txtView12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit2_in_focus1);
        editTxt12 = findViewById(R.id.editTxt12);
        txtView12 = findViewById(R.id.txtView12);

        displayResults();


    }

    protected void displayResults(){

        ReadFromFile<Efocus, Efocus, EditText, TextView> read = new ReadFromFile<>(Efocus.FOCUS3, Efocus.UNIT2, editTxt12, txtView12);
        read.readFocus();

        editTxt12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                read.read();
            }
        });
    }
}