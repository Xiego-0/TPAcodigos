package prjOperadores;

import java.util.Scanner;

public class Triangulos {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double a, b, c;
		System.out.println("Escreva o primeiro valor");
		a = ler.nextDouble();
		System.out.println("Escreva o segundo valor");
		b = ler.nextDouble();
		System.out.println("Escreva o terceiro valor");
		c = ler.nextDouble();
		
		if(a < b+c && b < a+c && c < a+b) {
			if(a == b && b == c) {
				System.out.println("Triangulo Equilatero");
			}else if(a != b && b != c){
				System.out.println("Triangulo Escaleno");
			}else{
				System.out.println("Triangulo Isóceles");
			}
		}else {
			System.out.println("Não é um triangulo");
		}
	}
}
