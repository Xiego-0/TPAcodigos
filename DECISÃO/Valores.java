package prjLista3;
import java.util.Scanner;
public class Valores {
	public static void main(String []args) {
		Scanner ler = new Scanner (System.in);
		int valor;
		
		System.out.println("Digite o valor");
		valor = ler.nextInt();
		
		if(valor>0) {
			System.out.println("Número positivo");
		}else if(valor == 0 ) {
			System.out.println("Número neutro");
		}else if(valor<0) {
			System.out.println("Número negativo");
		}
	}

}
