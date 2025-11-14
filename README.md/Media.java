package prjVetor;

import java.util.*;

public class Media {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[], i,soma;
		double media;
		soma = 0;
		
		final int TAM = 10;
		a = new int[TAM];
		
		//Laço para leitura do Vetor A
		System.out.println("Leitura do Vetor A: ");
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i+1) + "º valor do vetor A");
			a[i] = in.nextInt();
			soma = soma + a[i];
		}
		
		//Calculando a média 
		media = soma/TAM;
		
		//Apresentando a média
		System.out.println("A média é: " + media);

	}

}
