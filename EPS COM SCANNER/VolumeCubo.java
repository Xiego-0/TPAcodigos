package prjLista2;
import java.util.Scanner;
public class VolumeCubo {
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		double aresta, volume;
		
		System.out.println("Digite o tamnho da aresta do cubo");
		aresta = ler.nextDouble();
		volume=aresta*aresta*aresta;
		
		System.out.println("O volume é "+volume);
	}

}
