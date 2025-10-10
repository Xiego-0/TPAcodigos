package prjLista2;
import java.util.Scanner;
public class AreaTriangulo {
	public static void main(String[]args){
		Scanner ler=new Scanner(System.in);
		//declaração de variaveis
		double base, altura, area;
		
		System.out.println ("Digite a base do triangulo");
		base = ler.nextDouble();
		
		System.out.println ("Digite a altura do triangulo");
		altura = ler.nextDouble();
		
		area=(base*altura)/2;
	 System.out.println ("Sua Área é " + area);
	}

}
