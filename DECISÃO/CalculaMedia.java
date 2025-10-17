package prjOperadores;

import java.util.Scanner;

public class CalculaMedia {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double nota1, nota2, media, exame;
		System.out.println("Digite a primeira nota");
		nota1 = ler.nextDouble();
		System.out.println("Digite a segunda nota");
		nota2 = ler.nextDouble();
		
		media = (nota1+nota2)/2 ;
		System.out.println("Sua média é: "+media);
		
		if(media >=6 ) {
			System.out.println("Reprovado");
		}else if(media >= 3 && media < 6) {
			System.out.println("Você esta em exame");
			System.out.println("Digite a Nota do exame");
			exame = ler.nextDouble();
			media = (nota1 + nota2 + exame)/3;
			if(media >= 6) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
			}
		}else {
			System.out.println("Reprovado");
		}
	}

}
