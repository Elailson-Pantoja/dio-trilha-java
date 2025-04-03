package edu.elailson.sintaxes;
public class Controle {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume + "\n");


        smartTv.ligarTv();
        smartTv.desligarTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.diminuirVolume();

        smartTv.aumentarCanal();

        smartTv.diminuirCanal();

        smartTv.mudarCanal(10);

    }
}
 