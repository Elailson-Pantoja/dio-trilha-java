package edu.elailson.desafioDio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome completo: ");
        String nomeCliente = scanner.next();


        System.out.println("Agora, digite o numero da agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o numero da conta: ");
        int numeroConta = scanner.nextInt();
       
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println( "\"Olá " + nomeCliente +  ", obrigado por criar uma conta em nosso banco,sua agência é " + agencia );
        System.out.println(" conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque\".");


    }

    

    
}