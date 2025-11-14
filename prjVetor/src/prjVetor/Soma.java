package prjVetor;

import java.util.*;

public class Soma {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int a[], b[], c[], i;
		final int TAM = 5;
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		//Laço para leitura do vetor A
		System.out.println("Leitura Vetor A: ");
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i+1) + "º do Vetor A");
			a[i] = in.nextInt();
		}
		
		//Laço para leitura do vetor B
		System.out.println("Leitura Vetor B: ");
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i+1) + "º do Vetor B");
			b[i] = in.nextInt();
			//Fazendo a soma
			c[i] = a[i]+b[i];
		}
		
		//Laço para apresentção do vetor C
		System.out.println("Apresentação Vetor C: ");
		System.out.print("C = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
	}

}
