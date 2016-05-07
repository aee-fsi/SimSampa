package com.hfad.simsampa;

/**
 * Created by Alexandre on 07/05/2016.
 */
public class MeuDataProvider {

    private int icone;
    private String nome;
    private String populacao;

    public MeuDataProvider(int icone, String nome, String populacao) {
        this.icone = icone;
        this.nome = nome;
        this.populacao = populacao;
    }

    public int getIcone() {
        return icone;
    }

    public String getNome() {
        return nome;
    }

    public String getPopulacao() {
        return populacao;
    }
}
