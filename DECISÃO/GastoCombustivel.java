package prjOperadores;
import java.util.Scanner;
public class GastoCombustivel {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double capacidade, distancia, consumo;
		System.out.println("Digite a distancia percorrida em km");
		distancia = ler.nextDouble();
		System.out.println("Digite a capacidade do tanque de combustivel em litros");
		capacidade = ler.nextDouble();
		
		consumo = distancia/capacidade;
		if(consumo <= 10) {
			System.out.println("Ecônomico");
		}else {
			System.out.println("Não Ecônomico");
		}
	}
}
