package com.hfad.simsampa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button novoJogo = (Button) findViewById(R.id.novoJogo);
        
    }



    public void clicouBotao(View novoJogo){


        Intent objetoIntent = new Intent(MainActivity.this, TelaPrincipal.class);

        startActivity(objetoIntent);
        finish();

    }

    }

