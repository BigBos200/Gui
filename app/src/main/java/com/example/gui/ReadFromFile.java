package com.example.gui;


import android.os.Environment;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gui.Focus.Efocus;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ReadFromFile<F,U,E,V>{

    private HashMap<String, String> words = new HashMap<>();
    private Efocus efocus;
    private Efocus eunit;
    private EditText editText;
    private TextView textView;
    private String path = Environment.getExternalStorageDirectory().toString();


    public ReadFromFile(F efocus, U eunit, E editText, V textView) {
        this.efocus = (Efocus) efocus;
        this.eunit = (Efocus) eunit;
        this.editText = (EditText) editText;
        this.textView = (TextView) textView;

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
                words.put(read.nextLine(), read.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Map.Entry<String, String> x : words.entrySet()){
            System.out.println(x.getKey() + " " +  x.getValue());
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


}
