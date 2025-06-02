package com.elailson.enuns;

public enum EstadoBrasileiro {
    //ENUM: é um conjunto de objetos
    PARA ("Pará", "PA"),
    SAO_PAULO ("São Paulo","SP" ),
    RIO_JANEIRO ("Rio de Janeiro", "RJ"),
    MARANHAO ("Maranhão", "MA"),
    BELO_HORIZONTE ("Belo Horizonte", "BH");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }
    
    public String getNome(){
        return nome;
    }
     public String getSigla(){
        return sigla;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }

}
