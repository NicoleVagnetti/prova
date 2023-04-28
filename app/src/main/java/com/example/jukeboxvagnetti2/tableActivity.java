package com.example.jukeboxvagnetti2;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

public class tableActivity {

    Button buttonClicc = findViewById(R.id.buttonCliccami); //dichiaro e collego un oggetto button

        buttonCliccami.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {




        }
    };

    public String leggiFile(String nomeFile, Context c){

        String esito = "";

        AssetManager am = c.getAssets();
        String line;
        try {
            //1) APERTURA FILE
            InputStream is = am.open(nomeFile);
            //2) LETTURA DEL FILE
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                esito += line;
                esito += "\n";
            }
        } catch(FileNotFoundException ex){
            Log.e("TAG", "file non esistente");
            esito = "errore apertura";
        }
        catch (IOException e) {
            e.printStackTrace();
            Log.e("TAG", "errore lettura");
            esito = "errore lettura";
        }
        return esito;
    }



}
