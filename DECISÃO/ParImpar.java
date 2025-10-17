package prjLista3;
import java.util.Scanner;
public class ParImpar {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite o valor");
		valor = ler.nextInt();
		
		if(valor%2 > 0) {
			System.out.println("Seu numero é impar");
		}else {
			System.out.println("Seu numero é par");
		}
	}
}
