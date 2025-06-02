package com.elailson.construtor;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "24679856412");

        marcos.setEndereco("Rua boa vizinhança");


        System.out.println("Nome: " + marcos.getNome() + "\nCPF: " + marcos.getCpf() + "\nEndereço: " + marcos.getEndereco());
    }
}
