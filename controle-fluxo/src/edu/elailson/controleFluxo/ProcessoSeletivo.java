package edu.elailson.controleFluxo;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");


        double salarioBase = 2000;

        double salarioDesejado = 1900;

        analizarCandidato(salarioBase, salarioDesejado);
    }

    static void analizarCandidato(double salarioBase, double salarioDesejado){
        if (salarioBase > salarioDesejado){
            System.out.println("Ligar pro candidato agora");
        }
        else if (salarioBase == salarioDesejado){
            System.out.println("LIgar depois");
        }
        else{
            System.out.println("Ligar pro candidato e levar uma contraproposta");
        }
    }

}
