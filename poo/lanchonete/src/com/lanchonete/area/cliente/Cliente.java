package com.lanchonete.area.cliente;

import com.lanchonete.atendimento.Atendente;

public class Cliente {
    public String nome = "Elailson";

    public void escolherLanche(){
        System.out.println("Escolhendo lanche");
    }

    public void fazerPedido(){
        System.out.println("Fazendo pedido");
    }

    public void pagarConta(Atendente atendente){
        consultarSaldoAplicativo();
        System.out.println("Pagando para o atendente " + atendente.nome);
    }

    private void consultarSaldoAplicativo(){
        System.out.println("Consultando saldo");
    }

}
