package com.example.gui;


import android.os.Environment;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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

public class ReadFromFile<T,U>{

    private HashMap<String, String> words = new HashMap<>();
    private T efocus;
    private U eunit;


    public ReadFromFile(T efocus, U eunit) {
        this.efocus = efocus;
        this.eunit = eunit;
    }


    private EditText editText;
    private TextView textView;

    public ReadFromFile(EditText editText, TextView textView){
        this.editText = editText;
        this.textView = textView;
    }


    public void readFocus(){
        readFromEfocus(efocus, eunit);
    }


    private void readFromEfocus(@NotNull T efocus, U eunit) {
        String path = Environment.getExternalStorageDirectory().toString();

        if (efocus.equals(Efocus.EFOCUS1)) {


        } else if (efocus.equals(Efocus.EFOCUS2)) {

        } else if (efocus.equals(Efocus.EFOCUS3)) {
            if (eunit.equals(Efocus.EUNIT1)){

            }else if (eunit.equals(Efocus.EUNIT2)){

            }else if (eunit.equals(Efocus.EUNIT3)){

            }else if (eunit.equals(Efocus.EUNIT4)){

            }else if (eunit.equals(Efocus.EUNIT5)){

            }else if (eunit.equals(Efocus.EUNIT6)){
                try {
                    File file6 = new File(path + "/Download/Gui/Focus3/Unit6.txt");
                    FileInputStream fileRead6 = new FileInputStream(file6);
                    BufferedReader reader6 = new BufferedReader(new InputStreamReader((fileRead6)));
                    while (reader6.readLine() != null){
                        words.put(reader6.readLine(), reader6.readLine());
                    }
                    reader6.close();
                    fileRead6.close();

                    for (Map.Entry<String, String> x : words.entrySet()){
                        System.out.println(x.getKey() + " " + x.getValue());
                    }


                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

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


            }else if (eunit.equals(Efocus.EUNIT7)){

            }else if (eunit.equals(Efocus.EUNIT8)){

            }


        } else if (efocus.equals(Efocus.EFOCUS4)) {

        } else if (efocus.equals(Efocus.EFOCUS5)) {

        } else if (efocus.equals(Efocus.ESETTINGS)) {

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
