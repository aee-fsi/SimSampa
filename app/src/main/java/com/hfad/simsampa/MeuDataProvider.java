package com.hfad.simsampa;

/**
 * Created by Alexandre on 07/05/2016.
 */
public class MeuDataProvider {

    private int icone;
    private String nome;
    private String populacao;
    private String area;

    public MeuDataProvider(int icone, String nome, String populacao, String area) {
        this.icone = icone;
        this.nome = nome;
        this.populacao = populacao;
        this.area = area;
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

    public String getArea(){
        return area;
    }
}
