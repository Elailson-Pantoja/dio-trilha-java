package edu.elailson.controleFluxo;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 250;
        double valorSaque = 100;

        if(valorSaque < saldo){
            double saldoAtual = saldo - valorSaque;
            System.out.println("Saldo Anterior: R$ " + saldo + "\nValor do saque: R$" + valorSaque + "\nSando Atual: R$ " + saldoAtual);
        }
        else{
            System.out.println("Saldo Insuficiente!");
        }
    }
}
