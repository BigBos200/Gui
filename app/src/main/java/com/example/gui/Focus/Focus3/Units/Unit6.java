package com.example.gui.Focus.Focus3.Units;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.gui.Focus.Efocus;
import com.example.gui.R;
import com.example.gui.ReadFromFile;

import java.util.Objects;

public class Unit6 extends AppCompatActivity {

    private EditText editTxt6;
    private TextView txtView6;
    private Toolbar toolbar;
    private ListView listView;

    private Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit6);
        context = getApplicationContext();
        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        Objects.requireNonNull(actionBar).setDisplayHomeAsUpEnabled(true);

        editTxt6 = findViewById(R.id.editTxt36);
        txtView6 = findViewById(R.id.txtView36);
        listView = findViewById(R.id.listView36);




        displayResults(editTxt6, txtView6, context);


    }

    protected void displayResults(EditText editTxt6, TextView txtView6, Context aplicationContext){

        ReadFromFile<Efocus, Efocus, EditText, TextView> read = new ReadFromFile<>(Efocus.FOCUS3, Efocus.UNIT6, editTxt6, txtView6);
        read.readFocus();

        ReadFromFile read1 = new ReadFromFile(aplicationContext);
        listView.setAdapter(read1);
        editTxt6.addTextChangedListener(new TextWatcher() {
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