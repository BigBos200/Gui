package com.example.gui;


import android.os.Environment;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gui.Focus.Efocus;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadFromFile<F,U,E,V>{

    private HashMap<String, String> words = new HashMap<>();
    private Efocus efocus;
    private Efocus eunit;
    private EditText editText;
    private TextView textView;



    public ReadFromFile(F efocus, U eunit, E editText, V textView) {
        this.efocus = (Efocus) efocus;
        this.eunit = (Efocus) eunit;
        this.editText = (EditText) editText;
        this.textView = (TextView) textView;

    }


//    public ReadFromFile(EditText editText, TextView textView){
//        this.editText = editText;
//        this.textView = textView;
//    }


    public void readFocus(){
        readFromEfocus(efocus, eunit);
    }


    private void readFromEfocus(@NotNull Efocus efocus, Efocus eunit) {
        String path = Environment.getExternalStorageDirectory().toString();

        switch (efocus){
            case FOCUS1:
                switch (eunit){
                    case UNIT1:
                        break;
                }
            break;
            case FOCUS2:
                switch (eunit){
                    case UNIT1:
                        break;
                }
            break;
            case FOCUS3:
                switch (eunit){
                    case UNIT1:
                        break;
                    case UNIT2:
                        break;
                    case UNIT3:
                        break;
                    case UNIT4:
                        break;
                    case UNIT5:
                        break;
                    case UNIT6:
                        File file6 = new File(path + "/Download/Gui/Focus3/Unit6.txt");
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
                        break;
                    case UNIT7:
                        break;
                    case UNIT8:
                        break;
                }
                break;

                case FOCUS4:
                switch (eunit){
                    case UNIT1:
                        break;
                    case UNIT2:
                        break;
                    case UNIT3:
                        break;
                    case UNIT4:
                        break;
                    case UNIT5:
                        break;
                    case UNIT6:
                        break;
                    case UNIT7:
                        break;
                    case UNIT8:
                        break;
                }
                break;
                case FOCUS5:
                switch (eunit){
                    case UNIT1:
                        break;
                    case UNIT2:
                        break;
                    case UNIT3:
                        break;
                    case UNIT4:
                        break;
                    case UNIT5:
                        break;
                    case UNIT6:
                        break;
                    case UNIT7:
                        break;
                    case UNIT8:
                        break;
                }
                break;

                case SETTINGS:

                }

        }


        if (efocus.equals(Efocus.FOCUS1)) {


        } else if (efocus.equals(Efocus.FOCUS2)) {

        } else if (efocus.equals(Efocus.FOCUS3)) {
            if (eunit.equals(Efocus.UNIT1)){

            }else if (eunit.equals(Efocus.UNIT2)){

            }else if (eunit.equals(Efocus.UNIT3)){

            }else if (eunit.equals(Efocus.UNIT4)){

            }else if (eunit.equals(Efocus.UNIT5)){

            }else if (eunit.equals(Efocus.UNIT6)){
//                try {
//                    File file6 = new File(path + "/Download/Gui/Focus3/Unit6.txt");
//                    FileInputStream fileRead6 = new FileInputStream(file6);
//                    BufferedReader reader6 = new BufferedReader(new InputStreamReader((fileRead6)));
//                    while (reader6.readLine() != null){
//                        words.put(reader6.readLine(), reader6.readLine());
//                    }
//                    reader6.close();
//                    fileRead6.close();
//
//                    for (Map.Entry<String, String> x : words.entrySet()){
//                        System.out.println(x.getKey() + " " + x.getValue());
//                    }
//
//
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }

//                File file6 = new File(path + "/Download/Gui/Focus3/Unit6.txt");
//                try {
//                    Scanner read = new Scanner(file6);
//                    while (read.hasNextLine()){
//                        words.put(read.nextLine(), read.nextLine());
//                    }
//                } catch (FileNotFoundException e) {
//                    throw new RuntimeException(e);
//                }
//
//                for (Map.Entry<String, String> x : words.entrySet()){
//                    System.out.println(x.getKey() + " " +  x.getValue());
//                }


            }else if (eunit.equals(Efocus.UNIT7)){

            }else if (eunit.equals(Efocus.UNIT8)){

            }


        } else if (efocus.equals(Efocus.FOCUS4)) {

        } else if (efocus.equals(Efocus.FOCUS5)) {

        } else if (efocus.equals(Efocus.SETTINGS)) {

        }

    }

    public void read(){
        readFromHashMap(editText, textView);
    }


    private void readFromHashMap(EditText inputText, TextView outputText){

        inputText.findViewById(R.id.txtView6);
        outputText.findViewById(R.id.editTxt6);


//        switch (inputText.toString()){
//            case "editTxt6":
//                inputText.findViewById(R.id.txtView6);
//                break;
//
//        }
//
//        switch (outputText.toString()){
//            case "editTxt6":
//                outputText.findViewById(R.id.editTxt6);
//                break;
//
//        }

        for (Map.Entry<String, String> x : words.entrySet()){
            if (inputText.getText().toString().equals(x.getValue())){
                outputText.setText(x.getKey());
            } else if (inputText.getText().toString().equals(x.getKey())) {
                outputText.setText(x.getValue());
            }
        }
    }


}
