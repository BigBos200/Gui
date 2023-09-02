package com.example.gui.Focus.Focus3.Units;

import android.os.Bundle;
import android.os.Environment;
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
import com.example.gui.WordsListAdapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Unit6 extends AppCompatActivity {

    private EditText editTxt6;
    private TextView txtView6;
    private Toolbar toolbar;
    private ListView listView;
    private String path = Environment.getExternalStorageDirectory().toString();
    private ArrayList<String> wordsList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit6);
        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        Objects.requireNonNull(actionBar).setDisplayHomeAsUpEnabled(true);

        editTxt6 = findViewById(R.id.editTxt36);
        txtView6 = findViewById(R.id.txtView36);
        listView = findViewById(R.id.listView36);

        readFromFile();
        displayResults(editTxt6, txtView6);


    }

    protected void displayResults(EditText editTxt6, TextView txtView6){

        ReadFromFile<Efocus, Efocus, EditText, TextView> read = new ReadFromFile<>(Efocus.FOCUS3, Efocus.UNIT6, editTxt6, txtView6);
        read.readFocus();

        WordsListAdapter adapter = new WordsListAdapter(this, R.layout.list_layout, wordsList);
        listView.setAdapter(adapter);

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

    private void readFromFile(){
        File file6 = new File(path + "/Download/Gui/Focus3/UNIT6.txt");
        try {
            Scanner read = new Scanner(file6);
            while (read.hasNextLine()){
                wordsList.add(read.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}