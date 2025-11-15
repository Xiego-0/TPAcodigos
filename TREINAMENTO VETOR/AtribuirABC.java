package prjTreinamentoVetores;

import java.util.Scanner;

public class AtribuirABC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[], b[], c[], i;
        final int TAM=10;
        
        a = new int[TAM];
        b = new int[TAM];
        c = new int[TAM];

        for (i = 0; i < TAM; i++) {
        	System.out.println("Digite o " + (i+1) + "º valor do vetor A");
            a[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
        	System.out.println("Digite o " + (i+1) + "º valor do vetor B");
            b[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            if (a[i] > b[i]) {
                c[i] = 1;
            }else if (a[i] == b[i]) {
                c[i] = 0;
            }else {
                c[i] = -1;
            }
        }

        System.out.println("\nVetor C:");
        for (i = 0; i < TAM; i++) {
            System.out.println("C[" + i + "] = " + c[i]);
        }
    }
}