package prjLaco;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, n, resultado;
		System.out.println("Digite o Número");
		n=ler.nextInt();
		i=1;
		while (i<=10) {
			resultado = n*i;
			System.out.println("Resultado vezes "+i+" é igual a: "+resultado);
			i++;
		}
	
		
		

	}

}
