package edu.elailson.controleFluxo;

import java.util.concurrent.ThreadLocalRandom;;

public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50.0;
        int i = 1;
        while( mesada > 0){
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada){
                valorDoce = mesada;
            }

            System.out.println(i+"º Valor do Doce: R$ " + valorDoce + "Adicionado no carrinho");
            mesada = mesada - valorDoce;

            i++;
        }
        System.out.println("Mesada: R$ " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,12);
    }
}
