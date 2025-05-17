package com.lanchonete.atendimento.cozinha;

public class Almoxarifado {
    private void controlarEntrada(){
        System.out.println("Controlando a entrada de itens");
    }

    private void controlarSaida(){
        System.out.println("Controlando a saida de itens");
    }

    void entregarIngredientes(){
        System.out.println("Entregando ingredientes");
        controlarSaida();
    }

    void trocarGas(){
        System.out.println("Trocando gás");
    }

}
