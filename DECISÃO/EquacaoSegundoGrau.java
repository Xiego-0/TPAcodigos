package prjOperadores;
import java.util.Scanner;
public class EquacaoSegundoGrau {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double a, b, c, delta, bhaskara;
		System.out.println("Digite seu A");
		a = ler.nextDouble();
		
		System.out.println("Digite seu B");
		b = ler.nextDouble();
		
		System.out.println("Digite seu C");
		c = ler.nextDouble();
		
		delta = (b*b)-4*a*c;
		
		if(delta < 0) {
			System.out.println("Não existem raizes reais para sua equação");
		}else if(delta == 0) {
		bhaskara = (-b+Math.sqrt(delta))/(2*a);
		System.out.println(bhaskara);
		}else {			
			bhaskara = (-b+Math.sqrt(delta))/(2*a);
			System.out.println("Sua Primeira raiz é:" + bhaskara);
			
			bhaskara = (-b-Math.sqrt(delta))/(2*a);
			System.out.println("Sua segunda raiz é:" + bhaskara);
		}
	}
}
 