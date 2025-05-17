package com.lanchonete.atendimento;

import com.lanchonete.area.cliente.Cliente;

public class Atendente {

    public String nome = "Tanjiro";

    public void servirMesa(){
        pegarLancheNaCozinha();
        System.out.println("Servindo a mesa");
    }

    private void pegarLancheNaCozinha(){
        System.out.println("Pegando lanche na cozinha");
    }

    public void receberPagamento(Cliente cliente){
        System.out.println("Recebendo pagamento de " + cliente.nome);
    }

    void trocarGas(){
        System.out.println("Atendente trocando gas");
    }

    public void pegarPedidoNoBalcao(){
        System.out.println("Pegando pedido no balcão");
    }
}
