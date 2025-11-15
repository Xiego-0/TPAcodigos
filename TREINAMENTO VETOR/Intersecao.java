package prjTreinamentoVetores;

import java.util.Scanner;

public class Intersecao {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, a[], b[], c[], posicao;
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
        	System.out.println("Digite o " + (i+1) + "º valor do vetor B");
            b[i] = in.nextInt();
        }
        for (i = 0; i < TAM; i++) {
            for (j = 0; j < TAM; j++) {
                if (a[i] == b[j])
                    c[posicao++] = a[i];
            }
        }	
  

        System.out.println("Interseção:");
        for (i = 0; i < posicao; i++)
            System.out.print(c[i] + " ");
    }
}

