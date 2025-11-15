package prjTreinamentoVetores;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int a[], i, j;
        final int TAM = 10;
        a = new int[TAM];

        for (i = 0; i < TAM; i++) {
       	 System.out.println("Digite o " + (i+1) + "º valor do vetor A");
            a[i] = in.nextInt();
        }
        
        for (i = 0; i < TAM; i++) {
            System.out.println("Pares até " + a[i] + ": ");
            for (j = 0; j <= a[i]; j++) {
                if (j % 2 == 0) {
                    System.out.println(j + " ");
                 }
             }
         }
     }
 }