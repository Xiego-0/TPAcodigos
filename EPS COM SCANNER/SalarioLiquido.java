package prjLista2;
import java.util.Scanner;
public class SalarioLiquido {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salarioBruto, valorDescontado, salarioLiquido;
		
		System.out.println("Digite seu salário bruto");
		salarioBruto=ler.nextDouble();
		
		valorDescontado=salarioBruto*0.14;
		salarioLiquido=salarioBruto-valorDescontado;

		System.out.println("O salario Liquido é "+salarioLiquido);
	}

}
