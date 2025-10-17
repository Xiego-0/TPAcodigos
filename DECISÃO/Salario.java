package prjOperadores;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double salario, irpf;
		System.out.println("Digite o seu Salario");
		salario = ler.nextDouble();
		if(salario <= 1434.39) {
			System.out.println("Sem descontos");
		}else if(salario <=2150.00) {
			irpf = salario*(7.5/100)-107.59;
			System.out.println("O desconto do IRPF é: " + irpf);
		}else if(salario <= 2866.70) {
			irpf = salario*(15/100)-268.84;
			System.out.println("O desconto do IRPF é: " + irpf);
		}else if(salario <= 3582.00) {
			irpf = salario*(22/100)-483.84;
			System.out.println("O desconto do IRPF é: " + irpf);
		}else {
			irpf = salario*(27.5/100)-662.94;
			System.out.println("O desconto do IRPF é: " + irpf);
		}
	}

}
