package edu.elailson.controleFluxo;

public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        int nota = 8;

        if(nota >= 7){
            System.out.println("Aprovado");
        }
        else if( nota >= 5 && nota < 7){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
