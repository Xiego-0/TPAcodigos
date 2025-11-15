package prjTreinamentoVetores;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, fat, a[], b[];
        final int TAM = 15;
        
        a = new int[TAM];
        b = new int[TAM];


        for (i = 0; i < TAM; i++) {
        	System.out.println("Digite o " + (i+1) + "º valor do vetor A");
            a[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            fat = 1;
            for (j = 1; j <= a[i]; j++) {
                fat = fat * j;
            b[i] = fat;
            }
        }
        
        System.out.println("Fatoriais ");
        for (i = 0; i < TAM; i++)
            System.out.println(a[i] + " = " + b[i]);
    }

}
