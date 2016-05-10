package com.hfad.simsampa;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class
ListaSubprefeituras extends AppCompatActivity {

    ListView subprefeituras;
    Dados sub = new Dados();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_subprefeituras);


        subprefeituras = (ListView) findViewById(R.id.listaSubprefeituras);

        ArrayAdapter<String> meuAdaptador = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                sub.subprefeiturasCentro
        );

//        subprefeituras.setAdapter(meuAdaptador);



        AdaptadorCustom adaptador;

        int i = 0;
        adaptador = new AdaptadorCustom(getApplicationContext(), R.layout.minha_celula);
        for(String nome:sub.subprefeiturasCentro){
            MeuDataProvider dataProvider = new MeuDataProvider(sub.iconesSub[i], nome, sub.populaçãoSubprefeituras[i], sub.areaSub[i]);
            adaptador.add(dataProvider);
            i++;
        }



        subprefeituras.setAdapter(adaptador);

        subprefeituras.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent objetoIntent = new Intent(ListaSubprefeituras.this, Subprefeitura.class);
                objetoIntent.putExtra("nomeSubprefeitura", sub.subprefeiturasCentro[position]);

                startActivity(objetoIntent);
                getParent();

            }
        });
    }


}
