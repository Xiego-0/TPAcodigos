package prjOperadores;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int anoNascimento, anoAtual, idade;
		System.out.println("Digite o ano que você nasceu");
		anoNascimento = in.nextInt();
		
		System.out.println("Digite o ano atual");
		anoAtual = in.nextInt();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		idade = anoAtual-anoNascimento;
		
		System.out.println("Sua idade é: " + idade);
		if (idade < 10){
			System.out.println("Criança");
		}else if(idade < 18) {
			System.out.println("Adolescente");
		}else if(idade <= 60) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
		}
	}
}
 