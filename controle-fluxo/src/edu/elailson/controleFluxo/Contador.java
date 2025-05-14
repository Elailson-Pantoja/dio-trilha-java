package edu.elailson.controleFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if( parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;
        int i=1;
        System.out.println("Contando de " + i  + " até " + contagem);
        for(int indice= 1; indice <= contagem; i++){
            System.out.println(indice++);
        }
	}
}