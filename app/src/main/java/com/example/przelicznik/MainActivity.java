package com.example.przelicznik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;


public class MainActivity extends AppCompatActivity {


    private SeekBar suwak;
    private EditText edt1,edt2,pierwszaWaluta,drugaWaluta;


    double PlnToEuro =0.22;
    double PlnToUsd =0.25;
    double UsdToPln=4.08;
    double UsdToEuro=0.89;
    double EuroToUsd=1.13;
    double EuroToPln=4.60;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        suwak=findViewById(R.id.seekbar1);
        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        pierwszaWaluta=findViewById(R.id.pierwszaWaluta);
        drugaWaluta=findViewById(R.id.drugaWaluta);
        suwak=findViewById(R.id.seekbar1);
        suwak.setProgress(0);
        edt1.setText(0+"");
        suwak.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    edt1.setText((double)progress+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void radioPrzelicz1(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.rg1Pln:
                if (checked)

                    break;
            case R.id.rg1Usd:
                if (checked)

                    break;
            case  R.id.rg1Euro:
                if (checked)

                    break;
        }
    }

    public void radioPrzelicz2(View view) {
        boolean checked = ((RadioButton) view).isChecked();


        switch(view.getId()) {
            case R.id.rg2Pln:
                if (checked)

                    break;
            case R.id.rg2Usd:
                if (checked)

                    break;
            case  R.id.rg2Euro:
                if (checked)

                    break;
        }
    }


      }
