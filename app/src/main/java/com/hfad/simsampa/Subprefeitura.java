package com.hfad.simsampa;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Subprefeitura extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {


     int Verba = 20000;
     int Investimento = 0;
    int totalSeekBar=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subprefeitura);

        TextView meutexto = (TextView) findViewById(R.id.nomeSubprefeitura);
        TextView verbaTexto = (TextView) findViewById(R.id.textViewValorDisponivel);
        TextView investimentoTexto = (TextView) findViewById(R.id.textViewValorInvestido);

        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(this);

        SeekBar seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        seekBar2.setOnSeekBarChangeListener(this);

        SeekBar seekBar3 = (SeekBar) findViewById(R.id.seekBar3);
        seekBar3.setOnSeekBarChangeListener(this);

        SeekBar seekBar4 = (SeekBar) findViewById(R.id.seekBar4);
        seekBar4.setOnSeekBarChangeListener(this);




        Intent novoIntent = getIntent();
        String nome = novoIntent.getStringExtra("nomeSubprefeitura");


        meutexto.setText(nome);
        Button confirmaJogo = (Button) findViewById(R.id.buttonConfirma);
        verbaTexto.setText("Verba: "+Verba);
        investimentoTexto.setText("Investido: "+Investimento);




    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        if (seekBar == seekBar.findViewById(R.id.seekBar) ){
            ((TextView) findViewById(R.id.textViewSeekBar)).setText("Investir: " + progress);

        }
        if (seekBar == seekBar.findViewById(R.id.seekBar2)){
            ((TextView) findViewById(R.id.textViewSeekBar2)).setText("Investir: " + progress);

        }
        if (seekBar == seekBar.findViewById(R.id.seekBar3)){
            ((TextView) findViewById(R.id.textViewSeekBar3)).setText("Investir: " + progress);

        }
        if (seekBar == seekBar.findViewById(R.id.seekBar4)){
            ((TextView) findViewById(R.id.textViewSeekBar4)).setText("Investir: " + progress);
           ;
        }



    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {


        TextView verbaTexto = (TextView) findViewById(R.id.textViewValorDisponivel);
        TextView investimentoTexto = (TextView) findViewById(R.id.textViewValorInvestido);
        SeekBar seekBar1 = (SeekBar) findViewById(R.id.seekBar);
        SeekBar seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        SeekBar seekBar3 = (SeekBar) findViewById(R.id.seekBar3);
        SeekBar seekBar4 = (SeekBar) findViewById(R.id.seekBar4);
        totalSeekBar = (seekBar1.getProgress())+(seekBar2.getProgress())+(seekBar3.getProgress())+(seekBar4.getProgress());
        int verbaLocal = Verba - totalSeekBar;
        int investimentolocal = Investimento + totalSeekBar;
        verbaTexto.setText("Verba: "+verbaLocal);
        investimentoTexto.setText("Investido: "+investimentolocal);


    }

    public void confirmaBotao(View Parent){
        Verba = Verba - totalSeekBar;
        Investimento = Investimento + totalSeekBar;
        getParent();


    }

}
