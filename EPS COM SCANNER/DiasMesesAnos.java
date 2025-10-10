package prjLista2;
import java.util.Scanner;
public class DiasMesesAnos {
		public static void main(String args[]) {
			Scanner ler = new Scanner(System.in);
			double mes, ano, dia;
		
		System.out.println("Digite a quantidade de dias");
		dia=ler.nextDouble();
		
		mes= dia/30;
		ano= dia/365;
		
		System.out.println(dia + " Dias em meses são: "+mes+" meses");
		System.out.println(dia + " Dias em anos são: "+ ano +" anos");	
	}
}

