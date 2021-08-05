package br.com.atividadeaula03;

import java.util.Scanner;

public class EVM01 {
	
	public static void main (String[] args){
		
	Scanner ler = new Scanner(System.in);	
	
	int[] pontos = new int [5]; 
	int maior=0;
	
	 System.out.println("Digite 5 Pontos:");

		for(int i = 0; i < 5; i++) {			
		 pontos[i] = ler.nextInt();
				 
		if( pontos[i] > maior) {
			maior= pontos[i];
		}
		
	}
		
		System.out.println("\nO maior ponto é: " + maior);
	
}
}