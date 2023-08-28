package com.example.gui;


import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gui.Focus.Efocus;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ReadFromFile<F,U,E,V> extends BaseAdapter {

    private HashMap<String, String> words = new HashMap<>();
    private ArrayList<String> listWords = new ArrayList<>();

    private TextView leftTxt;
    private TextView rightTxt;
//    private Context aplicationContext;
    private Efocus efocus;
    private Efocus eunit;
    private EditText editText;
    private TextView textView;
//    private LayoutInflater inflater;
    private String path = Environment.getExternalStorageDirectory().toString();


    public ReadFromFile(F efocus, U eunit, E editText, V textView) {
        this.efocus = (Efocus) efocus;
        this.eunit = (Efocus) eunit;
        this.editText = (EditText) editText;
        this.textView = (TextView) textView;
    }

    public ReadFromFile(Context context){
        this.context = (Context) context;

    }

    public void readFocus(){
        readFromEfocus(efocus, eunit, path);
    }


    private void readFromEfocus(@NotNull Efocus efocus, Efocus eunit, String path) {

        switch (efocus) {
            case FOCUS1:
                switch (eunit) {
                    case UNIT1 -> readFromFile(path, efocus, eunit);
                    case UNIT2 -> readFromFile(path, efocus, eunit);
                    case UNIT3 -> readFromFile(path, efocus, eunit);
                    case UNIT4 -> readFromFile(path, efocus, eunit);
                    case UNIT5 -> readFromFile(path, efocus, eunit);
                    case UNIT6 -> readFromFile(path, efocus, eunit);
                    case UNIT7 -> readFromFile(path, efocus, eunit);
                    case UNIT8 -> readFromFile(path, efocus, eunit);
                }
                break;
            case FOCUS2:
                switch (eunit) {
                    case UNIT1 -> readFromFile(path, efocus, eunit);
                    case UNIT2 -> readFromFile(path, efocus, eunit);
                    case UNIT3 -> readFromFile(path, efocus, eunit);
                    case UNIT4 -> readFromFile(path, efocus, eunit);
                    case UNIT5 -> readFromFile(path, efocus, eunit);
                    case UNIT6 -> readFromFile(path, efocus, eunit);
                    case UNIT7 -> readFromFile(path, efocus, eunit);
                    case UNIT8 -> readFromFile(path, efocus, eunit);
                }
                break;
            case FOCUS3:
                switch (eunit) {
                    case UNIT1 -> readFromFile(path, efocus, eunit);
                    case UNIT2 -> readFromFile(path, efocus, eunit);
                    case UNIT3 -> readFromFile(path, efocus, eunit);
                    case UNIT4 -> readFromFile(path, efocus, eunit);
                    case UNIT5 -> readFromFile(path, efocus, eunit);
                    case UNIT6 -> readFromFile(path, efocus, eunit);
                    case UNIT7 -> readFromFile(path, efocus, eunit);
                    case UNIT8 -> readFromFile(path, efocus, eunit);
                }
                break;

            case FOCUS4:
                switch (eunit) {
                    case UNIT1 -> readFromFile(path, efocus, eunit);
                    case UNIT2 -> readFromFile(path, efocus, eunit);
                    case UNIT3 -> readFromFile(path, efocus, eunit);
                    case UNIT4 -> readFromFile(path, efocus, eunit);
                    case UNIT5 -> readFromFile(path, efocus, eunit);
                    case UNIT6 -> readFromFile(path, efocus, eunit);
                    case UNIT7 -> readFromFile(path, efocus, eunit);
                    case UNIT8 -> readFromFile(path, efocus, eunit);
                }
                break;
            case FOCUS5:
                switch (eunit) {
                    case UNIT1 -> readFromFile(path, efocus, eunit);
                    case UNIT2 -> readFromFile(path, efocus, eunit);
                    case UNIT3 -> readFromFile(path, efocus, eunit);
                    case UNIT4 -> readFromFile(path, efocus, eunit);
                    case UNIT5 -> readFromFile(path, efocus, eunit);
                    case UNIT6 -> readFromFile(path, efocus, eunit);
                    case UNIT7 -> readFromFile(path, efocus, eunit);
                    case UNIT8 -> readFromFile(path, efocus, eunit);
                }
                break;

            case SETTINGS:
                break;

        }

    }

    private void readFromFile(String path, Efocus efocus, Efocus eunit){
        File file6 = new File(path + "/Download/Gui/" + efocus.toString() + "/" + eunit.toString() + ".txt");
        try {
            Scanner read = new Scanner(file6);
            while (read.hasNextLine()){
                listWords.add(read.nextLine());
                words.put(read.nextLine(), read.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Map.Entry<String, String> x : words.entrySet()){
            System.out.println(x.getKey() + " " +  x.getValue());
        }

        firstStream();
    }

    private void firstStream(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            listWords
                    .forEach(System.out::println);
        }
    }


    public void read(){
        readFromHashMap(editText, textView);
    }


    private void readFromHashMap(EditText inputText, TextView outputText){
        for (Map.Entry<String, String> x : words.entrySet()){
            if (inputText.getText().toString().equals(x.getValue())){
                outputText.setText(x.getKey());
            } else if (inputText.getText().toString().equals(x.getKey())) {
                outputText.setText(x.getValue());
            }
        }
    }



    @Override
    public int getCount() {
        return listWords.toArray().length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private Context context;
    LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View convertView1 = inflater.inflate(R.layout.list_layout, null);
        leftTxt = convertView.findViewById(R.id.leftTxt);
        rightTxt = convertView.findViewById(R.id.rightTxt);

        leftTxt.setText(listWords.get(position));
//        rightTxt.setText(listWords.get(position));


        return convertView1;
    }
}
