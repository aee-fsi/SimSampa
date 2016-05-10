package com.hfad.simsampa;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //Usuário
    private Button botaoSalvar;
    private TextView meuTexto;
    private EditText campoNome;
    private float pontuacao;
    private int nivel;
    private float popularidade;
    private int verba;
    private int turno;
    private int id;

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

