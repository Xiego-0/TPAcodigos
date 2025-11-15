package prjTreinamentoVetores;

import java.util.Scanner;

public class AtribuirAB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[], b[], i;
        final int TAM=10;
        
        a = new int[TAM];
        b = new int[TAM];

        for (i = 0; i < TAM; i++) {
        	System.out.println("Digite o " + (i+1) + "º valor do vetor A");
            a[i] = in.nextInt();
        }
        for (i = 0; i < TAM; i++) {
            if (a[i] % 2 == 0)
                b[i] = 1;
            else
                b[i] = 0;
        }
        System.out.println("\nVetor B:");
        for (i = 0; i < 10; i++) {
            System.out.println("B[" + i + "] = " + b[i]);
        }
    }
}

