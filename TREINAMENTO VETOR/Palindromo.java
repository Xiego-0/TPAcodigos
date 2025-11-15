package prjTreinamentoVetores;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[], i, palindromo;
        
        final int TAM=10;
        
        a = new int[TAM];
        palindromo = 1;

        for (i = 0; i < TAM; i++) {
        	System.out.println("Digite o " + (i+1) + "º valor do vetor A");
            a[i] = in.nextInt();
        }

        for (i = 0; i < TAM / 2; i++) {
            if (a[i] != a[TAM - 1 - i]) {
                palindromo = 0;
            }
        }
        if (palindromo == 1) {
            System.out.println("Vetor é um palíndromo.");
        }else {
            System.out.println("Vetor não é um palíndromo.");
        }
    }
}

