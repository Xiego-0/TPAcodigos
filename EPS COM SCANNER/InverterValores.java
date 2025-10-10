package prjLista2;
import java.util.Scanner;
public class InverterValores {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		//declaraçao de variaveois
		int valorA, valorB, valorC;
		
		System.out.println ("Digite valor A");
		valorA = ler.nextInt();
		
		System.out.println ("Digite valor B");
		valorB = ler.nextInt();
		
		valorC=valorA;
		valorA=valorB;
		valorB=valorC;
		
		System.out.println ("valor A é "+valorA);
		System.out.println ("valor B é "+valorB);	
		

	}

}
