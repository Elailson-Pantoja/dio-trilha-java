package com.elailson.enuns;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e : EstadoBrasileiro.values()){
            //System.out.println(e.getNome() + " - " + e.getSigla());
        }

        EstadoBrasileiro para = EstadoBrasileiro.PARA;

        System.out.println(para.getNome());
        System.out.println(para.getSigla());
        System.out.println(para.getNomeMaiusculo());

    }
}
