package prjFor;

import java.util.Scanner;

public class IdadeAlturaPeso {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double peso, altura, contadorPeso, somaAlturas, mediaAlturas;
		int idade, i, cIdade50, cIdade1020, idadeMaisVelha, idadeMaisNova;
		cIdade50 = 0;
		cIdade1020 = 0;
		contadorPeso = 0;
		somaAlturas = 0;
		mediaAlturas = 0;
		idadeMaisVelha = 0;
		idadeMaisNova = 0;
		for ( i=1; i<=5; i++) {
			System.out.println("Digite a idade da " + i + "ª pessoa");
			idade = ler.nextInt();
			System.out.println("Digite a altura da " + i + "ª pessoa");
			altura = ler.nextDouble();
			System.out.println("Digite o peso da " + i + "ª pessoa em quilos");
			peso = ler.nextDouble();
			
			if(idade>=50) {
				cIdade50++;
			}else if (idade>=10 && idade <=20) {
				somaAlturas = somaAlturas + altura;
				cIdade1020++;
			}else if (peso<=40) {
				contadorPeso++;
			}
			
			if(i==1){
				idadeMaisVelha = idade;
				idadeMaisNova = idade;
			}
			else  if (idade > idadeMaisVelha) {
		        idadeMaisVelha = idade;
		    }else if (idade < idadeMaisNova) {
		        idadeMaisNova = idade;
		    }
		}
		System.out.println(cIdade50 + " Pessoas possuem mais de 50 anos");
		contadorPeso = (contadorPeso/25) * 100;
		System.out.println(contadorPeso + "% das pessoas possuem menos de 40 quilos");
		if (cIdade1020 > 0) {
			mediaAlturas = somaAlturas/cIdade1020;
		}
		System.out.println("A média da altura das pessoas entre 10 e 20 anos é " + mediaAlturas);
		System.out.println("Idade mais velha: " + idadeMaisVelha);
		System.out.println("Idade mais nova: " + idadeMaisNova);
	}

}
