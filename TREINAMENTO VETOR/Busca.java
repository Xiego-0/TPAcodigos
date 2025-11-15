package prjTreinamentoVetores;

import java.util.Scanner;

public class Busca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[], i, x, encontrado;
        final int TAM=10;
        a = new int[10];

        encontrado = 0;

        for (i = 0; i < 10; i++) {
        	System.out.println("Digite o " + (i+1) + "º valor do vetor A");
            a[i] = in.nextInt();
        }

        // Ler o valor X
        System.out.print("Digite o valor X para buscar no vetor: ");
        x = in.nextInt();

        for (i = 0; i < 10; i++) {
            if (a[i] == x) {
                encontrado = 1;
            }
        }

        if (encontrado == 1) {
            System.out.println("O valor " + x + "Tá no vetor.");
        } else {
            System.out.println("O valor " + x + " Não tá no vetor.");
        }
    }
}