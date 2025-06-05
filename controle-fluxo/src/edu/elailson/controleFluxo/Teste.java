package edu.elailson.controleFluxo;


import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        System.out.println("Saldo Inicial: R$ ");
        double saldoInicial = scanner.nextDouble();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        System.out.println("1º entrada: R$ ");
        double primeiraEntrada = scanner.nextDouble();
        System.out.println("2º entrada: R$ ");
        double segundaEntrada = scanner.nextDouble();
        System.out.println("3º entrada: R$ ");
        double terceiraEntrada = scanner.nextDouble();
        
        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        
        double saldoFinal = saldoInicial + primeiraEntrada + segundaEntrada + terceiraEntrada;
        
        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}