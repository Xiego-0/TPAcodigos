package prjTreinamentoVetores;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int a[], i, j, tabuada;
		final int TAM = 5;
		
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i+1) + "º valor do vetor A");
			a[i] = in.nextInt();
		}
		
        for(i=0; i<TAM; i++) {
            System.out.println("\nTabuada do numero " + a[i]+ "\n");
            for(j=1; j<=10; j++) {
            	tabuada = (a[i] * j);
                System.out.println(a[i] + "x" + j + "=" + tabuada);
            }
        }


	}

}
