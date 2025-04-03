public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 5;

    void ligarTv(){
        ligada = true;
        System.out.println("Smart TV ligada");
       
    }
    void desligarTv(){
        ligada = false;
        System.out.println("Smart TV desligada");
    }

    void aumentarVolume(){
        System.out.println("Novo volume: " + ++volume);
    }

    void diminuirVolume(){
        System.out.println("Novo volume: " + --volume);
    }

    int mudarCanal(int novoCanal){
        System.out.println("Novo canal: " + novoCanal);
        return novoCanal;
    }

    void aumentarCanal(){
        canal++;
        System.out.println("Novo canal: " + canal);
    }

    void diminuirCanal(){
        canal--;
        System.out.println("Novo canal: " + canal);
    }
}
