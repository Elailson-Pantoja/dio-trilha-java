package edu.elailson.controleFluxo;

public class ExemploFor {
    public static void main(String[] args) {
        System.out.println("Contando carneirinhos");
        for(int carneirinho = 0; carneirinho < 20; carneirinho++){
            System.out.println(carneirinho+1);
        }
        System.out.println("Joãozinho dormiu..");


        //For com Array
        String alunos[] = { "Elailson", "Tayara", "Az", "Danny"};

        System.out.println("Lista de alunos");
        for(int i=0; i < alunos.length; i++){
            System.out.println("Nº " + (i+1) + ": " + alunos[i]);
        }

        for (String aluno : alunos) {
            System.out.println("Nome do aluno: "+ aluno);
        }
    }
}
