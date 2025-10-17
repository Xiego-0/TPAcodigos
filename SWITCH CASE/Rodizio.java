package prjSwitchCase;

import java.util.Scanner;

public class Rodizio {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int fimP;
		System.out.println("Digite o último número da placa");
		fimP=ler.nextInt();
		switch(fimP) {
		case 1:
		case 2:
			System.out.println("Não poderá circular segundas-feiras");
			break;
		case 3:
		case 4:
			System.out.println("Não poderá circular terças-feiras");
			break;
		case 5:
		case 6:
			System.out.println("Não poderá circular quartas-feiras");
			break;
		case 7:
		case 8:
			System.out.println("Não poderá circular quintas-feiras");
			break;
		case 9:
		case 0:
			System.out.println("Não poderá circular sexta-feiras");
			break;
		default:
			System.out.println("Número inválido");
		}
	}
}
