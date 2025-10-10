package prjLista2;
import java.util.Scanner;
public class Idade {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		//declaraçao de variaveis
		int anoNascimento, anoAtual, idade;
		
		System.out.println("Digite o ano que você nasceu");
		anoNascimento = ler.nextInt();
		
		System.out.println("Digite o ano atual");
		anoAtual = ler.nextInt();
		
		idade=anoAtual-anoNascimento;
		
		System.out.println("Sua Idade é " + idade);
	}
}
