package com.berkaysevim.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button ,button2,button3,button4,button5,button6,button7,
            button8,button9,button10,button_virgul,toplam,cıkartma,bolme,carpma,silme,esittir;
    EditText sonuc;


    Float value1,value2;
    Boolean topla_durum = false,cikartma_durum=false,carpma_durum= false, bolme_durum = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.button) ;
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);

        button_virgul = (Button) findViewById(R.id.button_virgul);
        toplam = (Button) findViewById(R.id.topla);
        carpma = (Button) findViewById(R.id.carpma);
        bolme = (Button) findViewById(R.id.bolme);
        cıkartma = (Button) findViewById(R.id.cikartma);
        esittir = (Button) findViewById(R.id.esittir);
        silme = (Button) findViewById(R.id.sil);

        sonuc = (EditText) findViewById(R.id.sonuc);





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText((sonuc.getText()+"1"));
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"9");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() { // 0
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"0");
            }
        });button_virgul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+",");
            }

        });


        silme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText("");
            }
        });


       toplam.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

                   value1 = Float.parseFloat(sonuc.getText()+"");
                    topla_durum = true;
                    sonuc.setText("");
           }
       });




        cıkartma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    value1 = Float.parseFloat(sonuc.getText()+"");
                    cikartma_durum = true;
                    sonuc.setText("");

            }
        });
        carpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    value1 = Float.parseFloat(sonuc.getText()+"");
                    carpma_durum = true;
                    sonuc.setText("");

            }
        });
        bolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    value1 = Float.parseFloat(sonuc.getText() + "");
                    bolme_durum = true;
                    sonuc.setText("");


            }
        });

        esittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2 =Float.parseFloat(sonuc.getText()+"");
                sonuc.setText("");
                if(topla_durum=true)
                {sonuc.setText(value1+value2+"");
                    topla_durum=false;}


                if(cikartma_durum=true) {
                    sonuc.setText(value1-value2+"");
                    cikartma_durum=false;
                }

                if(carpma_durum=true)
                {
                    sonuc.setText(value1*value2+"");
                    carpma_durum=false;

                 }

                if(bolme_durum=true)
                {
                    sonuc.setText(value1/value2+"");
                    bolme_durum=false;
                }


            }
        });




    }
}