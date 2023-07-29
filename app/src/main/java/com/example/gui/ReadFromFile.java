package com.example.gui;


import android.os.Environment;
import android.widget.Toast;

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

public class ReadFromFile<T,U> {

    private HashMap<String, String> words = new HashMap<>();
    private T efocus;
    private U eunit;

    private String name = "Adam";

    public ReadFromFile(T efocus, U eunit) {
        this.efocus = efocus;
        this.eunit = eunit;
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

            }else if (eunit.equals(Efocus.EUNIT7)){

            }else if (eunit.equals(Efocus.EUNIT8)){

            }


        } else if (efocus.equals(Efocus.EFOCUS4)) {

        } else if (efocus.equals(Efocus.EFOCUS5)) {

        } else if (efocus.equals(Efocus.ESETTINGS)) {

        }

    }





}
