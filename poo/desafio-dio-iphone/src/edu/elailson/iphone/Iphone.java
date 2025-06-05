package edu.elailson.iphone;

import edu.elailson.aparelhoTelefonico.AparelhoTelefonico;
import edu.elailson.navegadorInternet.NavegadorInternet;
import edu.elailson.reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    private String modelo;
    private int memoriaRam;
    private int memoriaExterna;

    @Override
    public void tocar() {
        System.out.println("Tocando musica no Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica no Iphone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionado musica no Iphone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página no Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página no Iphone");
    }

    @Override
    public void ligar() {
        System.out.println("ligando pelo Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o Iphone");
    }

    @Override
    public void iniciarCorreiroVoz() {
        System.out.println("Iniciando um correio de voz no Iphone");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getMemoriaExterna() {
        return memoriaExterna;
    }

    public void setMemoriaExterna(int memoriaExterna) {
        this.memoriaExterna = memoriaExterna;
    }

}

