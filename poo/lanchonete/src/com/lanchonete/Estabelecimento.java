package com.lanchonete;

import com.lanchonete.area.cliente.Cliente;
import com.lanchonete.atendimento.Atendente;
import com.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //Ações que o estaabelecimento precisa ter ciência
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();
        
        Cliente cliente = new Cliente();

        Atendente atendente = new Atendente();
        atendente.servirMesa();
        atendente.receberPagamento(cliente);
        
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta(atendente);

    }
    
}
