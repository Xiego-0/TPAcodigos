package prjOperadores;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double peso, altura, imc;
		System.out.println("Digite sua altura em metros");
		altura = ler.nextDouble();
		System.out.println("Digite seu peso em kg");
		peso = ler.nextDouble();
		imc = peso/(altura*altura);
		System.out.println("Seu IMC é:  " + imc);
		if(imc < 18.5) {
			System.out.println("Excesso de Magreza");
		}else if(imc <= 25) {
			System.out.println("Peso Normal");
		}else if(imc <= 30) {
			System.out.println("Excesso de Peso");
		}else if (imc <=35){
			System.out.println("Obesidade Grau I");
		}else if(imc <=40) {
			System.out.println("Obesidade Grau II");
		}else{
			System.out.println("Obesidade grau III");
		}
	}

}
