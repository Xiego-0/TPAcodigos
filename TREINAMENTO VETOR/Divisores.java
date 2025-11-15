package prjTreinamentoVetores;

import java.util.Scanner;

public class Divisores {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], i, j;
	    final int TAM=10;
	    a = new int [TAM];

	    for (i = 0; i < TAM; i++) {	
	    	System.out.println("Digite o " + (i+1) + "º valor do vetor A");
	        a[i] = in.nextInt();
	    }
	    for (i = 0; i < TAM; i++) {
	        System.out.println("Divisores de " + a[i] + ": ");
	        for (j = 1; j <= a[i]; j++) {
	            if (a[i] % j == 0) {
	            	System.out.println(j + " ");
	            }
	        }
	    }
	}
}
