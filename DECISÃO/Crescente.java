package prjOperadores;

import java.util.Scanner;

public class Crescente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		System.out.println("Digite o primeiro valor");
		a = ler.nextInt();
		System.out.println("Digite o segundo valor");
		b = ler.nextInt();
		System.out.println("Digite o terceiro valor");
		c = ler.nextInt();
		if(a > b && b > c) {
			System.out.println(a +", "+ b + ", " + c);
		}else if(a > c && c > b) {
			System.out.println(a +", "+ c + ", " + b);
		}else if(b > a && a > c){
			System.out.println(b +", "+ a + ", " + c);
		}else if(b > c && c > a) {
			System.out.println(b +", "+ c + ", " + a);
		}else if(c > a && a > b){
			System.out.println(c +", "+ a + ", " + b);
		}else{
			System.out.println(c +", "+ b + ", " + a);
		}
	}
}
