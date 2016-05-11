package com.hfad.simsampa;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by Érica on 11/05/2016.
 */
public class CadastraUsuario extends Activity {
    private static String JOGO_PREFERENCIAS = "Preferências Jogo";
    private Button botaoSalva;
    private Button botaoCarrega;
    private EditText NomeSalva;
    private TextView NomeCarrega;
    private int scoreJogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastra_usuario);

        botaoSalva = (Button) findViewById(R.id.botaoSalva);
        NomeCarrega = (TextView) findViewById(R.id.textViewNomeUser);
        NomeSalva = (EditText) findViewById(R.id.campoNome);

        //NomeSalva = (EditText) findViewById(R.id.text);


        botaoSalva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = getSharedPreferences(JOGO_PREFERENCIAS, 0);

                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("nome", NomeSalva.getText().toString());
                // editor.putString("pontos", scoreJogo.toString());

                //editor.putString("ponto", NomeSalva.getText().toString());
                // editor.putString("nome", NomeSalva.getText().toString());


            }
        });

    }

}





