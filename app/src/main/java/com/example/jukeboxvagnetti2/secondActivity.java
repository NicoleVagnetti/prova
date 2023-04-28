package com.example.jukeboxvagnetti2.;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity {


    private Button bottoneTxt;

    //array dalla quale prendo l'indice delle canzoni per stamparlo
    private String[] canzoni = new String[]{
            "Pastello Bianco",
            "A mano A mano",
            "Take me Home",
            "Attention",

    };

    TextView txt;
    TextView canzone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle = getIntent().getExtras();



        //codice per stampare il numero generato random nella main Activity
        txt = findViewById(R.id.textNumber);
        String numero = bundle.getString("String");
        if(numero!= null){
            txt.setText(numero);
        }else{
            txt.setText("Errore");
            return;
        }

        int songIndex = bundle.getInt("Num"); //recupero il valore sotto forma di numero per trovare il nome della canzone che voglio stampare
        canzone = findViewById(R.id.arrayCanzoni);
        canzone.setText(canzoni[songIndex]);

        bottoneTxt = findViewById(R.id.link);


    }




    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

}