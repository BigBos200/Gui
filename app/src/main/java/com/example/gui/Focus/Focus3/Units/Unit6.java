package com.example.gui.Focus.Focus3.Units;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
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
    String[] fruits = {"Apple", "Orange", "Banana", "Kivi"};


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

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        displayResults(editTxt6, txtView6, context);


    }

    protected void displayResults(EditText editTxt6, TextView txtView6, Context aplicationContext){

        ReadFromFile<Efocus, Efocus, EditText, TextView> read = new ReadFromFile<>(Efocus.FOCUS3, Efocus.UNIT6, editTxt6, txtView6);
        read.readFocus();

//        ReadFromFile read1 = new ReadFromFile(aplicationContext);
//        listView.setAdapter(read1);
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


    private class CustomAdapter extends BaseAdapter {
        private TextView leftTxt, rightTxt;

        @Override
        public int getCount() {
            return fruits.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view1 = getLayoutInflater().inflate(R.layout.list_layout, null);

            leftTxt = view1.findViewById(R.id.leftTxt);
            rightTxt = view1.findViewById(R.id.rightTxt);

            leftTxt.setText(fruits[position]);
            rightTxt.setText(fruits[position]);

            return view1;
        }
    }
}