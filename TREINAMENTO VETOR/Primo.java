package prjTreinamentoVetores;

import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int a[], i, j, divisores;
		final int TAM = 10;
		a = new int[TAM];
		divisores = 0;
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i+1) + "º valor do vetor A");
			a[i]= in.nextInt();
		}
		
        for (i = 0; i < TAM; i++) {
            divisores = 0;
            for (j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    divisores++;
                }
            }
		    if (divisores == 2) {
		        System.out.println(a[i] + " É primo!");
		    } else {
		        System.out.println(a[i] + " Não é primo!");
		    }
		 }
	}
}
