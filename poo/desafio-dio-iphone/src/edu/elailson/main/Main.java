package edu.elailson.main;

import edu.elailson.aparelhoTelefonico.AparelhoTelefonico;
import edu.elailson.iphone.Iphone;
import edu.elailson.navegadorInternet.NavegadorInternet;
import edu.elailson.reprodutorMusical.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.setModelo("IPhone 7");
        iphone.setMemoriaRam(4);
        iphone.setMemoriaExterna(128);

        AparelhoTelefonico ap = new Iphone();
        ap.atender();
        ap.ligar();
        ap.iniciarCorreiroVoz();

        NavegadorInternet nv = new Iphone();
        nv.exibirPagina("Página do Iphone");
        nv.adicionarNovaAba();
        nv.atualizarPagina();

        ReprodutorMusical rm = new Iphone();
        rm.selecionarMusica("Racionais Mcs - A vida é Desafio");
        rm.tocar();
        rm.pausar();
    }
}
