package com.elailson.pilarespoo;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConetacdoInternet(){
        System.out.println("Validando se está conetado a internet");
    }

}
