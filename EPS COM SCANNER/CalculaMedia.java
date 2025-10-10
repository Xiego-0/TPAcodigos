package prjLista2;
import java.util.Scanner;
public class CalculaMedia {
	public static void main (String[]args){	
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.println("Digite 1º nota:");
		nota1=ler.nextDouble();
		
		System.out.println("Digite 2º nota:");
		nota2=ler.nextDouble();
		media=(nota1+nota2)/2;
		
		System.out.println("Sua média é: "+media);
	}
}
