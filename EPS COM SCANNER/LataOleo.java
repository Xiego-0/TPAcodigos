package prjLista2;
import java.util.Scanner;
public class LataOleo {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		//declaração de variaveis
		double raio, altura, volume;
		System.out.println("Digite o raio");
		raio=ler.nextDouble();
		
		System.out.println("Digite a altura");
		altura=ler.nextDouble();
		
		volume=3.14*(raio*raio)*altura;
		
		System.out.println("O volume é "+volume);
	}

}
