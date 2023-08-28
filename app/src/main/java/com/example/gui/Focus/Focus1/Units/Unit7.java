package com.example.gui.Focus.Focus1.Units;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.gui.Focus.Efocus;
import com.example.gui.R;
import com.example.gui.ReadFromFile;

public class Unit7 extends AppCompatActivity {
    private EditText editTxt;
    private TextView txtView;
    private Toolbar toolbar;
    private ListView listView;

    private final Context context = getApplicationContext();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit7_in_focus1);
        editTxt = findViewById(R.id.editTxt17);
        txtView = findViewById(R.id.txtView17);

        displayResults(editTxt, txtView);


    }

    protected void displayResults(EditText editTxt6, TextView txtView6){

        ReadFromFile<Efocus, Efocus, EditText, TextView> read = new ReadFromFile<>(Efocus.FOCUS3, Efocus.UNIT6, editTxt6, txtView6);
        read.readFocus();


        editTxt.addTextChangedListener(new TextWatcher() {
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