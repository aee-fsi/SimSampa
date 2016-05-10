package com.hfad.simsampa;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Inicializacao extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicializacao);


        Handler handler = new Handler();
        handler.postDelayed(this, 2040);

    }


    @Override
    public void run(){
        startActivity(new Intent(this, MainActivity.class));
        finish();

    }
}
