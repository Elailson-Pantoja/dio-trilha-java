package com.elailson.getterseseters;

public class Escola {
    public static void main(String[] args) {
        Aluno tayara = new Aluno();

        tayara.setNome("Tayara");
        tayara.setIdade(23);

        System.out.println("A Aluna " + tayara.getNome() + " tem " + tayara.getIdade() + " anos");
    }
}
