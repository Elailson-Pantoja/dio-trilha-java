package com.elailson.pilarespoo;

public class MSNMensseger extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem(){
        validarConetacdoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem(){
        validarConetacdoInternet();
        System.out.println("Recebendo mensagem");
        salvarHistoricoMensagem();
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico de mensagem");
    }
}