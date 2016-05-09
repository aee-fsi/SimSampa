package com.hfad.simsampa;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class Subprefeitura extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subprefeitura);

        TextView meutexto = (TextView) findViewById(R.id.nomeSubprefeitura);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);




        Intent novoIntent = getIntent();
        String nome = novoIntent.getStringExtra("nomeSubprefeitura");

        meutexto.setText(nome);



    }

}
