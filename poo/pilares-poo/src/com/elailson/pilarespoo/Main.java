package com.elailson.pilarespoo;

public class Main {
    public static void main(String[] args) {
        MSNMensseger msn = new MSNMensseger();
        msn.enviarMensagem();

        Facebook fcb = new Facebook();
        fcb.enviarMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
    }
}
