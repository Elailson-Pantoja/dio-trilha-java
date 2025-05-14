package edu.elailson.controleFluxo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");

        String [] candidatos = {"Marcia", "Felipe", "João", "Carlos", "Juliana"};

        /*double salarioBase = 2000;

        double salarioDesejado = 1900;

        analizarCandidato(salarioBase, salarioDesejado);*/

        //selecaoDeCandidatos();
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }


    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }
            else
                System.out.println("Contato Realizado Com Sucesso!");
        }
        while(continuarTentando && tentativasRealizadas <3);
            if (atendeu) 
                System.out.println("Contato com candidato " + candidato + " realizado na " + tentativasRealizadas + " tentativa");
            else
                System.out.println("Não conseguimos contato com o candidato " + candidato + " com " + tentativasRealizadas + " tentativas máximas");

        
    }


    static boolean atender(){
        return new Random().nextInt(3)==1;
    }


    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2000);
    }

    static void selecaoDeCandidatos(){
        String [] candidatos = {"Marcia", "Felipe", "João", "Carlos", "Juliana", "Yasmim", "Tayara", "Elailson", "Azenilton", "Danny", "Deiwedi", "Kássia", "Rodrigo"};

        int candidatosSelecionados = 0;
        int candidatoAtual=0;
        double salarioBase = 2000;

        while (candidatosSelecionados < 5  && candidatoAtual  < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();        

            //System.out.println("Candidato: " + candidato + "\nSalário: R$ " + salarioPretendido);

            if (salarioBase >= salarioPretendido){
                String candidatosAprovados [];
                System.out.println("Candidato: " + candidato + "\nSalário Pretendido: R$ " + salarioPretendido + "\n✅Foi sellecionado");
                    
                candidatosSelecionados++;
            }

            candidatoAtual++;
       }
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
