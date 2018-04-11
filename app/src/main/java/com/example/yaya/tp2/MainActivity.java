package com.example.yaya.tp2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int[] Couleur={Color.BLUE,Color.BLACK,Color.RED,Color.GRAY,Color.YELLOW,Color.TRANSPARENT,Color.CYAN,Color.LTGRAY,Color.MAGENTA,Color.GREEN};



    TextView Montexte;
    Button Monbouton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Montexte=(TextView)findViewById(R.id.mytext);
        Monbouton=findViewById(R.id.mybottun);

        Monbouton.setOnClickListener(new View.OnClickListener() {
            int Nbrclic=1;
            @Override
            public void onClick(View view) {

                Random rando=new Random();
                int i=rando.nextInt(Couleur.length-1);

                Monbouton.setTextColor(Couleur[i]);
                Montexte.setTextColor(Couleur[i]);
                Montexte.setText("Nombre de cliques est : "+Nbrclic);
                Nbrclic++;


            }
        });
    }
}
