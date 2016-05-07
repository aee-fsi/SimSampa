package com.hfad.simsampa;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TelaPrincipal extends AppCompatActivity {

    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        ImageButton subprefeituras = (ImageButton) findViewById(R.id.botaosubprefeituras);


    }

    public boolean clicaTela(View view) {

        AlertDialog.Builder construtor;
        construtor = new AlertDialog.Builder(this);

        construtor.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });


        if (i == 0) {
            AlertDialog bemVindo = construtor.create();
            bemVindo.setTitle("Bem Vindo!!");
            bemVindo.setMessage("Você é o novo prefeito de São Paulo. Controle a execução direta definida pela Lei de Orçamento de 2016 e cuidado com a popularidade.");
            bemVindo.show();
            i++;
            return true;
        }

        if (i == 1) {
            AlertDialog tutorial = construtor.create();
            tutorial.setTitle("Tutorial!!");
            tutorial.setMessage("Controle as finanças das subprefeituras e das secretarias do Transporte, Educação e Saúde.");
            tutorial.show();
            i++;
            return true;
        }
        if (i == 2) {
            AlertDialog tutorial = construtor.create();
            tutorial.setTitle("Tutorial!!");
            tutorial.setMessage("Cada turno corresponde a um mês! Clique na ampulheta para terminar o turno.");
            tutorial.show();
            i++;
            return true;
        }
    return false;
    }

    public void clicouBotaoSub(View botaosubprefeituras){


        Intent objeto = new Intent(TelaPrincipal.this, ListaSubprefeituras.class);

        startActivity(objeto);

    }

}

