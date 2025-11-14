package prjVetor;

import java.util.*;

public class Quadrado {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[], b[], i;
		final int TAM = 10;
		a = new int[TAM];
		b = new int[TAM];
		
		//Laço para leitura do Vetor A
		System.out.println("Leitura do Vetor A: ");
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i+1) + "º valor do vetor A");
			a[i] = in.nextInt();
			//Fazendo calculo do quadrado dos valores
			b[i] = a[i]*a[i];
		}
		
		//Laço para apresentação de B
		System.out.println("Apresentação do Vetor A: ");
		System.out.print("B = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("]");
	}

}
