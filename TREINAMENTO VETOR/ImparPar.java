package prjTreinamentoVetores;

import java.util.Scanner;

public class ImparPar {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[], b[], i, ib;
		final int TAM = 6;
		
		ib = 0;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i+1) + "º valor do vetor A");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			if(a[i]%2 == 0){
				b[ib] = a[i];
				ib++;
			}
		}
		
		for(i=0; i<TAM; i++) {
			if(a[i]%2 != 0) {
				b[ib] = a[i];
				ib++;
			}
		}
		
		for(i=0; i<TAM; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
