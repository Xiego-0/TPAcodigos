package prjTreinamentoVetores;

import java.util.Scanner;

public class Diferenca {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, posicao, existe,  a[], b[], c[];
        final int TAM = 10;
        
        posicao = 0;
        a = new int[TAM];
        b = new int[TAM];
        c = new int[TAM];


        for (i = 0; i < TAM; i++) {
        	System.out.println("Digite o " + (i+1) + "º valor do vetor A");
            a[i] = in.nextInt();
        }
        for (i = 0; i < TAM; i++) {
        	System.out.println("Digite o " + (i+1) + "º valor do vetor A");
            b[i] = in.nextInt();
        }
        for (i = 0; i < TAM; i++) {
            existe = 0;
            for (j = 0; j < TAM; j++) {
                if (a[i] == b[j]) {
                    existe = 1;
                }
            }
            if (existe == 0) {
                c[posicao++] = a[i];
            }
        }
        

    	System.out.println("Diferença (A - B): ");
        for (i = 0; i < posicao; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

